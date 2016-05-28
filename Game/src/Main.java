import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by ramilanigmatullina on 27.05.16.
 */
public class Main extends Application {
    public static ArrayList<Square> squares = new ArrayList<>();
    public static Pane appRoot = new Pane();
    public static Pane gameRoot = new Pane();
    public static int score = 0;

    private HashMap<KeyCode, Boolean> keys = new HashMap<>();
    public Label scoreLabel = new Label();
    public Label yourScore = new Label();
    public Label gameOver = new Label();

    Image image = new Image(getClass().getResourceAsStream("images/1.png"));
    ImageView imageView = new ImageView(image);
    Character character = new Character(imageView);
    Button button;
    boolean oops = false;

    public Parent createContent() {
        button = new Button("New Game");
        gameRoot.setPrefSize(310, 380);

        for(int i = -100; i < 0; i++) {
            Square square = new Square();
            square.setTranslateY(i * 200 + 220);

            int height = new Random().nextInt(290);
            square.setTranslateX(height);
            squares.add(square);

            gameRoot.getChildren().addAll(square);
        }

        scoreLabel.setTranslateX(10);
        scoreLabel.setTranslateY(15);
        yourScore.setTranslateX(114);
        yourScore.setTranslateY(150);
        gameOver.setTranslateX(120);
        gameOver.setTranslateY(130);
        button.setTranslateX(114);
        button.setTranslateY(180);
        gameRoot.getChildren().addAll(character, scoreLabel, yourScore, gameOver);
        appRoot.getChildren().addAll(gameRoot);
        return appRoot;
    }

    public void update() {
        scoreLabel.setText("Score: " + score);

        if (squares != null)
            for (Square square : squares) {
                square.setTranslateY(square.getTranslateY() + 2);
                if (square.getTranslateY() == 362) {
                    gameOver.setText("Game over");
                    yourScore.setText("Your score: " + score);
                    scoreLabel.setText(" ");
                    oops = true;
                }
            }

        if (isPressed(KeyCode.RIGHT)) {
            character.animation.play();
            character.animation.setOffsetY(64);
            character.moveX(2);
        } else if (isPressed(KeyCode.LEFT)) {
            character.animation.play();
            character.animation.setOffsetY(32);
            character.moveX(-2);
        } else{
            character.animation.stop();
        }

        if (oops) {
            for (Square square : squares) {
                gameRoot.getChildren().remove(square);
            }
            gameRoot.getChildren().addAll(button);
        }
    }

    public boolean isPressed(KeyCode key) {
        return keys.getOrDefault(key, false);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(createContent());
        primaryStage.setScene(scene);

        scene.setOnKeyPressed(event->keys.put(event.getCode(),true));
        scene.setOnKeyReleased(event-> {
            keys.put(event.getCode(), false);
        });

        primaryStage.show();
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (!oops)
                    update();
            }
        };
        timer.start();
    }


    public void stop() {

    }

    public static void main (String[] args) {
        launch(args);
    }
}

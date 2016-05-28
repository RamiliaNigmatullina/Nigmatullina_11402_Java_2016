import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Created by ramilanigmatullina on 27.05.16.
 */

public class MyCircle extends Pane {

    Circle circle;

    public MyCircle() {
        circle = new Circle();
        circle.setCenterX(17.0f);
        circle.setCenterY(17.0f);
        circle.setRadius(10.0f);
        circle.setFill(Color.ROYALBLUE);
        getChildren().add(circle);
    }
}

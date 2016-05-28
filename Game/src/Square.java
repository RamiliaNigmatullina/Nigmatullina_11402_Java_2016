import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by ramilanigmatullina on 27.05.16.
 */

public class Square extends Pane {

    Rectangle square;

    public Square() {
        square = new Rectangle(20, 20, Color.BLUE);
        getChildren().add(square);
    }
}

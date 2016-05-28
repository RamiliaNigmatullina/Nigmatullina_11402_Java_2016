import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

/**
 * Created by ramilanigmatullina on 27.05.16.
 */

public class Character extends Pane {
    ImageView imageView;
    int count = 3;
    int columns = 3;
    int offsetX = 0;
    int offsetY = 0;
    int width = 32;
    int height = 32;
    SpriteAnimation animation;
    public Character(ImageView imageView) {
        this.imageView = imageView;
        this.imageView.setViewport(new Rectangle2D(offsetX,offsetY,width,height));
        this.setTranslateX(139);
        this.setTranslateY(348);
        animation = new SpriteAnimation(imageView,Duration.millis(200),count,columns,offsetX,offsetY,width,height);
        getChildren().addAll(imageView);
    }
    public void moveX(int x){
        boolean right = x > 0;
        for(int i = 0; i < Math.abs(x); i++) {
            if (right) this.setTranslateX(this.getTranslateX() + 1);
            else this.setTranslateX(this.getTranslateX() - 1);

            if (this.getTranslateX() < -3) {
                setTranslateX(-3);
            }

            if (this.getTranslateX() > 282) {
                setTranslateX(282);
            }
        }
    }
}

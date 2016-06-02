package ru.kpfu.itis.nigmatullina;

import javafx.application.Application;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.kpfu.itis.nigmatullina.configuration.Config;
import ru.kpfu.itis.nigmatullina.javafx.Loader;

/**
 * Created by ramilanigmatullina on 28.05.16.
 */

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Loader loader = context.getBean(Loader.class);
        loader.redirect("login");
        primaryStage.setScene(loader.getScene());
        primaryStage.show();
    }
}

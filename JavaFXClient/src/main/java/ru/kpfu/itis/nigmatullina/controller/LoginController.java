package ru.kpfu.itis.nigmatullina.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import ru.kpfu.itis.nigmatullina.connection.Connection;
import ru.kpfu.itis.nigmatullina.entity.User;
import ru.kpfu.itis.nigmatullina.javafx.Loader;

/**
 * Created by ramilanigmatullina on 28.05.16.
 */

@Configurable
public class LoginController {

    @Autowired
    public Loader loader;

    @Autowired
    public Connection connection;

    @FXML
    TextField usernameTextField;

    @FXML
    TextField passwordField;

    @FXML
    Label errorField;

    public void login() {
        User user = connection.auth(usernameTextField.getText(), passwordField.getText());
        if (user != null) {
            loader.redirect("catalog");
        } else {
            errorField.setText("Неправильный логин или пароль!");
        }
    }
}


package ru.kpfu.itis.nigmatullina.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.kpfu.itis.nigmatullina.connection.Connection;
import ru.kpfu.itis.nigmatullina.controller.*;
import ru.kpfu.itis.nigmatullina.javafx.Loader;

/**
 * Created by ramilanigmatullina on 28.05.16.
 */

@Configuration
public class Config {

    @Bean
    LoginController loginController() {
        return new LoginController();
    }

    @Bean
    MyController myController() {
        return new MyController();
    }

    @Bean
    Loader Loader() {
        return new Loader();
    }

    @Bean
    Connection serverApi() {
        return new Connection();
    }
}
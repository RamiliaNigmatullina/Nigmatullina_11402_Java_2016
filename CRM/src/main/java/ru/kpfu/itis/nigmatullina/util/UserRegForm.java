package ru.kpfu.itis.nigmatullina.util;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;


/**
 * Created by ramilanigmatullina on 04.05.16.
 */
public class UserRegForm {

    @NotEmpty(message = "Поле должно быть заполнено")
    private String username;

    @NotEmpty(message = "Поле должно быть заполнено")
    @Size(min = 6, max = 20, message = "В пароле должно быть не менее шести символов и не более 20-ти")
    private String password;

    @NotEmpty(message = "Поле должно быть заполнено")
    private String firstName;

    @NotEmpty(message = "Поле должно быть заполнено")
    private String lastName;

    @NotEmpty(message = "Поле должно быть заполнено")
    @Email(message = "Некорректный email")
    private String email;
}

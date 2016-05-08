package ru.kpfu.itis.nigmatullina.util;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by ramilanigmatullina on 04.05.16.
 */
public class WorkerRegForm {
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

    @NotEmpty(message = "Поле должно быть заполнено")
    private String phoneNumber;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

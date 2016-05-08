package ru.kpfu.itis.nigmatullina.util;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.kpfu.itis.nigmatullina.entity.User;
import ru.kpfu.itis.nigmatullina.entity.enums.Role;

/**
 * Created by ramilanigmatullina on 07.05.16.
 */
public class UserRegFormToUserTransf {
    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public static User transf(UserRegForm userRegForm) {
        User user = new User();

        user.setUsername(userRegForm.getUsername());
        user.setPassword(bCryptPasswordEncoder.encode(userRegForm.getPassword()));
        user.setFirstName(userRegForm.getFirstName());
        user.setLastName(userRegForm.getLastName());
        user.setEmail(userRegForm.getEmail());
        user.setRole(Role.ROLE_USER);
        return user;
    }
}

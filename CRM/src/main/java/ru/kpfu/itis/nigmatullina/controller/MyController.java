package ru.kpfu.itis.nigmatullina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.nigmatullina.entity.User;
import ru.kpfu.itis.nigmatullina.entity.enums.Role;
import ru.kpfu.itis.nigmatullina.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ramilanigmatullina on 08.05.16.
 */
@Controller
public class MyController {

    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Autowired
    UserService userService;

    @RequestMapping(value = "/join", method = RequestMethod.GET)
    public String regGet() {
        return "registration";
    }


    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public String regPost(ModelMap modelMap, @RequestParam String username, @RequestParam String password,
                        @RequestParam String firstName, @RequestParam String lastName, @RequestParam String email) {

        User user = new User();
        user.setUsername(username);
        user.setPassword(bCryptPasswordEncoder.encode(password));
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setRole(Role.ROLE_USER);
        userService.addUser(user);
        return "profile";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profile() {
        return "profile";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model, @RequestParam(value = "error", required = false) boolean error) throws IOException {
        if (error) {
            model.addAttribute("error", error);
        }
        return "login";
    }

}

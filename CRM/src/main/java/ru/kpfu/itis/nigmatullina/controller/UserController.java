package ru.kpfu.itis.nigmatullina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.nigmatullina.entity.User;
import ru.kpfu.itis.nigmatullina.service.UserService;

/**
 * Created by ramilanigmatullina on 08.05.16.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profile(ModelMap model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user", user);
        return "profile";
    }

    @RequestMapping(value = "/editprofile", method = RequestMethod.GET)
    public String editProfile(ModelMap model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user", user);
        return "editProfile";
    }

    @RequestMapping(value = "/editprofile", method = RequestMethod.POST)
    public String editProfile(ModelMap model,
                              @RequestParam(value = "firstName", required = true) String firstName,
                              @RequestParam(value = "lastName", required = true) String lastName,
                              @RequestParam(value = "email", required = true) String email,
                              @RequestParam(value = "information", required = true) String information) {

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setInformation(information);
        userService.editUser(user);
        return "redirect:profile";
    }
}

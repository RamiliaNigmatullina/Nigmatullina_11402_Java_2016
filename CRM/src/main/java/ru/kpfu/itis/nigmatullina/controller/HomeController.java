package ru.kpfu.itis.nigmatullina.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.nigmatullina.entity.User;

@Controller
@RequestMapping("/home")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "home";
    }
}

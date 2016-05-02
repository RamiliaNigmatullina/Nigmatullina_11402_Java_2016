package ru.kpfu.itis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Controller
@RequestMapping("/contact")
public class ContactController {
    @RequestMapping(method = RequestMethod.GET)
    public String contact() {
        return "contact";
    }
}

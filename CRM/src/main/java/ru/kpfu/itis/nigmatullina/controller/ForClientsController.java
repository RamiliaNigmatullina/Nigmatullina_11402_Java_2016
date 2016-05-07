package ru.kpfu.itis.nigmatullina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ramilanigmatullina on 03.05.16.
 */
@Controller
@RequestMapping("/forclients")
public class ForClientsController {
    @RequestMapping(value = "/callgager", method = RequestMethod.GET)
    public String callgager() {
        return "callgager";
    }
}

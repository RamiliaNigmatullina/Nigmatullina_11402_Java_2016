package ru.kpfu.itis.nigmatullina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Controller
@RequestMapping("/portfolio")
public class PortfolioController {
    @RequestMapping(method = RequestMethod.GET)
    public String portfolio() {
        return "portfolio";
    }
}

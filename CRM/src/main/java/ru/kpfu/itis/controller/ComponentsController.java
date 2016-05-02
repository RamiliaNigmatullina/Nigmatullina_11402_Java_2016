package ru.kpfu.itis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ramilanigmatullina on 18.04.16.
 */
@Controller
@RequestMapping("/components")
public class ComponentsController {
    @RequestMapping(method = RequestMethod.GET)
    public String components() {
        return "components";
    }
}

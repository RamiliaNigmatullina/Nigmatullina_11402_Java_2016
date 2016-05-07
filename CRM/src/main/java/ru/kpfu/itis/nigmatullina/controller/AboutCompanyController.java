package ru.kpfu.itis.nigmatullina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ramilanigmatullina on 03.05.16.
 */
@Controller
@RequestMapping("/company")
public class AboutCompanyController {
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public String info() {
        return "info";
    }

    @RequestMapping(value = "/career", method = RequestMethod.GET)
    public String career() {
        return "career";
    }

    @RequestMapping(value = "/guarantee", method = RequestMethod.GET)
    public String guarantee() {
        return "guarantee";
    }

    @RequestMapping(value = "/mission", method = RequestMethod.GET)
    public String mission() {
        return "mission";
    }

    @RequestMapping(value = "/advantages", method = RequestMethod.GET)
    public String advantages() {
        return "advantages";
    }

    @RequestMapping(value = "/manufacture", method = RequestMethod.GET)
    public String manufacture() {
        return "manufacture";
    }
}

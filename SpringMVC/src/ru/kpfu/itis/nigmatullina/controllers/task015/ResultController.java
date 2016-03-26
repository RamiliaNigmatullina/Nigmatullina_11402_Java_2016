package ru.kpfu.itis.nigmatullina.controllers.task015;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.Cookie;
import java.io.PrintWriter;

@Controller
@RequestMapping("/result")
public class ResultController {
    @RequestMapping(method = RequestMethod.GET)
    public String add(ModelMap model) {
        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            if (cookie.getName().equals("result")) {
                model.put("result", cookie.getValue());
                cookie.setMaxAge(0);
                response.addCookie(cookie);
                return "task015/result";
            }
        }
    }
}

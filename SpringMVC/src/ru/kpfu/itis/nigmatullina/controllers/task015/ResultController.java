package ru.kpfu.itis.nigmatullina.controllers.task015;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/result")
public class ResultController {
    @RequestMapping(value="/{operation}/{result}", method = RequestMethod.GET)
    public String result(ModelMap model, @PathVariable String operation, @PathVariable int result) {
        model.put("operation", operation);
        model.put("result", result);
        return "task015/result";
    }
}

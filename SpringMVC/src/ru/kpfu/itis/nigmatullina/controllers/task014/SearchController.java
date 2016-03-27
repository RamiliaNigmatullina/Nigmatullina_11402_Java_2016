package ru.kpfu.itis.nigmatullina.controllers.task014;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
@RequestMapping("/search")
public class SearchController {

    @RequestMapping(value="/add/{num1}/{num2}", method = RequestMethod.GET)
    public String add(ModelMap model, @PathVariable String num1, @PathVariable String num2) {
        try {
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            model.put("num1", n1);
            model.put("num2", n2);
            model.put("oper", "+");
            model.put("res", n1 + n2);
            return "task014/math";
        } catch (NumberFormatException e) {
            return "task014/404";
        }
    }

    @RequestMapping(value="/mult/{num1}/{num2}", method = RequestMethod.GET)
    public String mult(ModelMap model, @PathVariable String num1, @PathVariable String num2) {
        try {
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            model.put("num1", n1);
            model.put("num2", n2);
            model.put("oper", "*");
            model.put("res", n1 * n2);
            return "task014/math";
        } catch (NumberFormatException e) {
            return "task014/404";
        }
    }

    @RequestMapping(value="/getdate", method = RequestMethod.GET)
    public String getDate(ModelMap model) {
            Date d = new Date();
            String date = d.toString();
            model.put("date", date);
            return "task014/date";
    }

    @RequestMapping(value="/baidu.com", method = RequestMethod.GET)
    public String baidu(ModelMap model) {
        model.put("websiteAddress", "http://www.baidu.com/s");
        model.put("nameOfSearchSite", "Baidu");
        model.put("name", "wd");
        return "task014/search";
    }

    @RequestMapping(value="/bing", method = RequestMethod.GET)
    public String bing(ModelMap model) {
        model.put("websiteAddress", "https://www.bing.com/");
        model.put("nameOfSearchSite", "Bing");
        model.put("name", "q");
        return "task014/search";
    }

    @RequestMapping(value="/yahoo.com", method = RequestMethod.GET)
    public String yahoo(ModelMap model) {
        model.put("websiteAddress", "https://search.yahoo.com/search");
        model.put("nameOfSearchSite", "Yahoo");
        model.put("name", "p");
        return "task014/search";
    }

    @RequestMapping(value="/aol.com", method = RequestMethod.GET)
    public String aol(ModelMap model) {
        model.put("websiteAddress", "http://search.aol.com/aol/search");
        model.put("nameOfSearchSite", "Aol");
        model.put("name", "q");
        return "task014/search";
    }


    @RequestMapping(value="/*", method = RequestMethod.GET)
    public String searchPage() {
        return "task014/404";
    }
}

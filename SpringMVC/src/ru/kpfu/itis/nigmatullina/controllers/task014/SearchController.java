package ru.kpfu.itis.nigmatullina.controllers.task014;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/search")
public class SearchController {
    @RequestMapping(value="/add", method = RequestMethod.GET)
    public String add(ModelMap model, @RequestParam(required = false) String path) {
        Pattern p = Pattern.compile("([0-9]+)/([0-9]+)");
        Matcher m = p.matcher(path);
        System.out.println(path);
        if (m.matches()) {
            int num1 = Integer.parseInt(m.group(1));
            int num2 = Integer.parseInt(m.group(2));
            model.put("num1", num1);
            model.put("num2", num2);
            model.put("oper", "+");
            model.put("res", num1 + num2);
            return "task014/math";
        } else return "task014/404";
    }

    @RequestMapping(value="/mult", method = RequestMethod.GET)
    public String mult(ModelMap model, @RequestParam(required = false) String path) {
        Pattern p = Pattern.compile("/([0-9]+)/([0-9]+)");
        Matcher m = p.matcher(path);
        if (m.matches()) {
            int num1 = Integer.parseInt(m.group(1));
            int num2 = Integer.parseInt(m.group(2));
            model.put("num1", num1);
            model.put("num2", num2);
            model.put("oper", "*");
            model.put("res", num1 * num2);
            return "task014/math";
        } else return "task014/404";
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

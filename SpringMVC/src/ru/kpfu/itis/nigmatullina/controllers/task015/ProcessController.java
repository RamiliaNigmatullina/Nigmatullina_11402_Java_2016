package ru.kpfu.itis.nigmatullina.controllers.task015;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;

@Controller
@RequestMapping("/process")
public class ProcessController {

    @RequestMapping(method = RequestMethod.POST)
    public void processPost(ModelMap model, @RequestParam(required = false) String path) {
        String s = request.getParameter("text_field");
        String operation = request.getParameter("operation");
        if (operation.equals("characters")) {
            Cookie cookie = new Cookie("result", "The number of characters: " + s.length());
            response.addCookie(cookie);
        }
        else if (operation.equals("words")) {
            s = s.replaceAll("\\r\\n", " ").trim();
            int k;
            do {
                k = 0;
                if (s.contains("  ")) {
                    s = s.replaceAll("  ", " ");
                    k++;
                }
            } while (k != 0);
            String words[] = s.split(" ");
            int w = words.length;
            Cookie cookie = new Cookie("result", "The number of words: " + w);
            response.addCookie(cookie);
        }
        else if (operation.equals("sentences")) {
            int k = 0;
            for (int i = 1; i < s.length(); i++) {
                if ((s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '?') &&
                        s.charAt(i - 1) != '.' && s.charAt(i - 1) != '!' && s.charAt(i - 1) != '?') {
                    k++;
                }
            }
            Cookie cookie = new Cookie("result", "The number of sentences: " + k);
            response.addCookie(cookie);
        }
        else if (operation.equals("paragraphs")) {
            s = s.trim();
            int k = 0;
            if (s != null) {
                k++;
                for (int i = 1; i < s.length(); i++) {
                    if (s.charAt(i) == '\r' && s.charAt(i - 1) != '\n') {
                        k++;
                    }
                }
            }
            Cookie cookie = new Cookie("result", "The number of paragraphs: " + k);
            response.addCookie(cookie);
        }
        return ;
    }


    @RequestMapping(method = RequestMethod.GET)
    public String processGet(){
        return "task015/process";
    }
}

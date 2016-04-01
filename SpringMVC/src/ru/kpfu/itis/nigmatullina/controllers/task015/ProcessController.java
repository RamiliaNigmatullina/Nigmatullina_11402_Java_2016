package ru.kpfu.itis.nigmatullina.controllers.task015;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/process")
public class ProcessController {

    @RequestMapping(method = RequestMethod.POST)
    public String processPost(HttpServletRequest request) {
        String text = request.getParameter("text_field");
        String operation = request.getParameter("operation");
        int result = 0;
        switch (operation) {
            case "characters":
                result = text.length();
            case "words":
                text = text.replaceAll("\\r\\n", " ").trim();
                int k;
                do {
                    k = 0;
                    if (text.contains("  ")) {
                        text = text.replaceAll("  ", " ");
                        k++;
                    }
                } while (k != 0);
                String words[] = text.split(" ");
                result = words.length;
            case "sentences":
                for (int i = 1; i < text.length(); i++) {
                    if ((text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?') &&
                            text.charAt(i - 1) != '.' && text.charAt(i - 1) != '!' && text.charAt(i - 1) != '?') {
                        result++;
                    }
                }
            case "paragraphs":
                text = text.trim();
                if (!text.equals("")) {
                    result++;
                    for (int i = 1; i < text.length(); i++) {
                        if (text.charAt(i) == '\r' && text.charAt(i - 1) != '\n') {
                            result++;
                        }
                    }
                }
        }
        return "redirect:/result/" + operation + "/" + result;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String processGet(){
        return "task015/process";
    }
}

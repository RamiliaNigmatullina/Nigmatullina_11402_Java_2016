package ru.kpfu.itis.nigmatullina.controllers.task015;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/process")
public class ProcessController {

    @RequestMapping(method = RequestMethod.POST)
    public String processPost(@ModelAttribute Text text) {
        switch (text.getOperation()) {
            case "characters":
                return "redirect:/result/The number of characters: " + text.getText().length();
            case "words": {
                text.setText(text.getText().replaceAll("\\r\\n", " ").trim());
                int k;
                do {
                    k = 0;
                    if (text.getText().contains("  ")) {
                        text.setText(text.getText().replaceAll("  ", " "));
                        k++;
                    }
                } while (k != 0);
                String words[] = text.getText().split(" ");
                int w = words.length;
                return "redirect:/result/The number of words: " + w;
            }
            case "sentences": {
                int k = 0;
                for (int i = 1; i < text.getText().length(); i++) {
                    if ((text.getText().charAt(i) == '.' || text.getText().charAt(i) == '!' || text.getText().charAt(i) == '?') &&
                            text.getText().charAt(i - 1) != '.' && text.getText().charAt(i - 1) != '!' && text.getText().charAt(i - 1) != '?') {
                        k++;
                    }
                }
                return "redirect:/result/The number of sentences: " + k;
            }
            case "paragraphs": {
                text.setText(text.getText().trim());
                int k = 0;
                if (text.getText() != null) {
                    k++;
                    for (int i = 1; i < text.getText().length(); i++) {
                        if (text.getText().charAt(i) == '\r' && text.getText().charAt(i - 1) != '\n') {
                            k++;
                        }
                    }
                }
                return "redirect:/result/The number of paragraphs: " + k;
            }
        }
        return "task014/404";
    }

    @RequestMapping(method = RequestMethod.GET)
    public String processGet(Model model){
        model.addAttribute("text", new Text());
        return "task015/process";
    }
}

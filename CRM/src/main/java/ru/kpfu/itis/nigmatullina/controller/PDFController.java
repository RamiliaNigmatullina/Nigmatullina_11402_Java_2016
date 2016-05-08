package ru.kpfu.itis.nigmatullina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.kpfu.itis.nigmatullina.entity.Door;
import ru.kpfu.itis.nigmatullina.service.DoorService;

/**
 * Created by ramilanigmatullina on 05.05.16.
 */

@Controller
public class PDFController {

    @Autowired
    DoorService doorService;

    @RequestMapping(value = "/generate/pdf.htm", method = RequestMethod.GET)
    ModelAndView generatePdf() throws Exception {
        System.out.println("Calling generatePdf()...");


        Door door = doorService.getById(1);

/*        Employee employee = new Employee();
        employee.setFirstName("Yashwant");
        employee.setLastName("Chavan");
        */

        return new ModelAndView("pdfView", "door", door);
    }
}

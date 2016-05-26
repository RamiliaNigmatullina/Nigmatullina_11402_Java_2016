package ru.kpfu.itis.nigmatullina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.nigmatullina.entity.Gager;
import ru.kpfu.itis.nigmatullina.service.GagerService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramilanigmatullina on 26.05.16.
 */
@Controller
@RequestMapping("/worker")
public class WorkerController {
    @Autowired
    GagerService gagerService;

    @RequestMapping(value = "/todo", method = RequestMethod.GET)
    public String gager(ModelMap modelMap) {
        List<Gager> gagerList = gagerService.getAll();
        List<Gager> todo = new ArrayList<>();
        for (Gager gager : gagerList) {
            if (!gager.isDone())
                todo.add(gager);
        }
        modelMap.addAttribute("todo", todo);
        return "todo";
    }

    @RequestMapping(value = "/done", method = RequestMethod.GET)
    public String done(ModelMap modelMap) {
        List<Gager> gagerList = gagerService.getAll();
        List<Gager> done = new ArrayList<>();
        for (Gager gager : gagerList) {
            if (gager.isDone())
                done.add(gager);
        }
        modelMap.addAttribute("done", done);
        return "done";
    }

    @RequestMapping(value = "/setdone/{id}", method = RequestMethod.GET)
    public String setdone(@PathVariable int id) {
        Gager gager = gagerService.getById(id);
        gager.setDone(true);
        gagerService.editGager(gager);
        return "redirect:/worker/todo";
    }
}

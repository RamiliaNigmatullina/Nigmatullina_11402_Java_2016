package ru.kpfu.itis.nigmatullina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.nigmatullina.entity.User;
import ru.kpfu.itis.nigmatullina.entity.enums.Role;
import ru.kpfu.itis.nigmatullina.service.UserService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramilanigmatullina on 05.05.16.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String admin() {
        return "/addtomanager";
    }

    @RequestMapping(value = "/addtomanager", method = RequestMethod.GET)
    public String addtomanager(ModelMap modelMap) throws IOException {
        List<User> allUsers = userService.getAll();
        List<User> users = new ArrayList<>();
        for (User user : allUsers) {
            if (user.isWantBeManager() && user.getRole().equals(Role.ROLE_USER))
                users.add(user);
        }
        modelMap.addAttribute("users", users);
        return "addtomanager";
    }

    @RequestMapping(value = "/addtomanager/{id}", method = RequestMethod.GET)
    public String addtomanagertrue(ModelMap modelMap, @PathVariable int id) throws IOException {
        User user = userService.getById(id);
        user.setRole(Role.ROLE_WORKER);
        userService.editUser(user);
        return "redirect:/admin/addtomanager";
    }
}

package ru.kpfu.itis.nigmatullina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kpfu.itis.nigmatullina.entity.Gager;
import ru.kpfu.itis.nigmatullina.entity.User;
import ru.kpfu.itis.nigmatullina.service.GagerService;
import ru.kpfu.itis.nigmatullina.service.UserService;

import java.io.IOException;

/**
 * Created by ramilanigmatullina on 08.05.16.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    GagerService gagerService;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profile(ModelMap model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user", user);
        return "profile";
    }

    @RequestMapping(value = "/editprofile", method = RequestMethod.GET)
    public String editProfile(ModelMap model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user", user);
        return "editProfile";
    }

    @RequestMapping(value = "/editprofile", method = RequestMethod.POST)
    public String editProfile(@RequestParam(value = "firstName", required = true) String firstName,
                              @RequestParam(value = "lastName", required = true) String lastName,
                              @RequestParam(value = "email", required = true) String email,
                              @RequestParam(value = "phoneNumber") String phoneNumber,
                              @RequestParam(value = "creditCardNumber") String creditCardNumber,
                              @RequestParam(value = "postcode") Integer postcode,
                              @RequestParam(value = "passportID") String passportID,
                              @RequestParam(value = "address") String address,
                              @RequestParam(value = "information") String information) {

        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        if (information != null)
            user.setInformation(information);
        if (phoneNumber != null)
            user.setPhoneNumber(phoneNumber);
        if (creditCardNumber != null)
            user.setCreditCardNumber(creditCardNumber);
        if (postcode != null)
            user.setPostcode(postcode);
        if (passportID != null)
            user.setPassportID(passportID);
        if (address != null)
            user.setAddress(address);
        userService.editUser(user);
        return "redirect:profile";
    }

    @RequestMapping(value = "/imanager", method = RequestMethod.GET)
    public String imanager() throws IOException {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        user.setWantBeManager(true);
        userService.editUser(user);
        return "redirect:profile";
    }

    @RequestMapping(value = "/inotmanager", method = RequestMethod.GET)
    public String inotmanager() throws IOException {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        user.setWantBeManager(false);
        userService.editUser(user);
        return "redirect:profile";
    }

    @RequestMapping(value = "/callgager", method = RequestMethod.GET)
    public String callgagerget(ModelMap model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user", user);
        return "callgager";

    }

    @RequestMapping(value = "/callgager", method = RequestMethod.POST)
    public String callgagerpost(@RequestParam(value = "firstName", required = true) String firstName,
                                @RequestParam(value = "lastName", required = true) String lastName,
                                @RequestParam(value = "phoneNumber") String phoneNumber,
                                @RequestParam(value = "address") String address) {
        Gager gager = new Gager();
        gager.setFirstName(firstName);
        gager.setLastName(lastName);
        gager.setPhoneNumber(phoneNumber);
        gager.setAddress(address);
        gager.setDone(false);
        gagerService.addGager(gager);
        return "redirect:/home";

    }
}

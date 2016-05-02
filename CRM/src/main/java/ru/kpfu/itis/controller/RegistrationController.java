package ru.kpfu.itis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ramilanigmatullina on 18.04.16.
 */
@Controller
@RequestMapping("/join")
public class RegistrationController {
    @RequestMapping(method = RequestMethod.GET)
    public String regGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=UTF-8");
        /*Configuration cfg = ConfigSingleton.getConfig(getServletContext());
        Template tmp = cfg.getTemplate("registration.ftl");
        HashMap<String, Object> root = new HashMap<String, Object>();

        String back_to = request.getParameter("back");
        if (back_to == null)
            back_to = "/profile";

        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("current_user");

        ArrayList<City> cities = new CityRepository().getCities();

        root.put("back", back_to);
        root.put("cities", cities);
        root.put("username", user);

        if (user != null) {
            response.sendRedirect(back_to);
        }
        try {
            tmp.process(root, response.getWriter());
        } catch (TemplateException e) {
            e.printStackTrace();
        }*/
        return "registration";
    }


    @RequestMapping(method = RequestMethod.POST)
    public void regPost(HttpServletRequest request, HttpServletResponse response) {
        /*request.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("current_user");

        String back_to = request.getParameter("back");

        if (user != null) {
            if (back_to != null) {
                response.sendRedirect(back_to);
            } else {
                response.sendRedirect("/profile");
            }
        } else {
            String username = request.getParameter("username");
            String password_f = request.getParameter("password");
            String first_name = request.getParameter("first_name");
            String last_name = request.getParameter("last_name");
            String email = request.getParameter("email");

            MessageDigest md = null;
            String password = null;
            try {
                md = MessageDigest.getInstance("SHA-1");
                md.update(password_f.getBytes());
                password = new String(md.digest());
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            }

            new UserRepository().registration(username, password, first_name, last_name, email);
            response.sendRedirect("/login?back=" + back_to);
        }*/
    }
}

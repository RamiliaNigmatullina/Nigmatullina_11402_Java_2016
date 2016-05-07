package ru.kpfu.itis.nigmatullina.service;

import ru.kpfu.itis.nigmatullina.entity.User;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
public interface UserService {

    List<User> getAll();
    void addUser(User user);
    void deleteUser(int id);
    void editUser(User user);
    User getById(int id);
    User getByUsername(String username);
}

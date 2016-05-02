package ru.kpfu.itis.service;

import ru.kpfu.itis.entity.User;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
public interface UserService {

    List<User> getAll();
    List<User> getAllUsersWithRoleAdministrator();
    void addUser(User user);
    void deleteUser(int id);
    void editUser(User user);
    User getById(int id);
}

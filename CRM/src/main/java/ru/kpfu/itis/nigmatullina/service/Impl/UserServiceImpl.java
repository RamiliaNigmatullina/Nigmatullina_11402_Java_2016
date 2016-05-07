package ru.kpfu.itis.nigmatullina.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.nigmatullina.entity.User;
import ru.kpfu.itis.nigmatullina.repository.UserRepository;
import ru.kpfu.itis.nigmatullina.service.UserService;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public void addUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.delete(id);
    }

    @Override
    public void editUser(User user) {
        userRepository.saveAndFlush(user);
    }

    @Override
    public User getById(int id) {
        return userRepository.findOne(id);
    }

    @Override
    public User getByUsername(String username) {
        return userRepository.findOneByUsername(username);
    }
}

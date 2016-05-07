package ru.kpfu.itis.nigmatullina.service;

import ru.kpfu.itis.nigmatullina.entity.User;
import ru.kpfu.itis.nigmatullina.entity.Worker;

import java.util.List;

/**
 * Created by ramilanigmatullina on 04.05.16.
 */
public interface WorkerService {

    List<Worker> getAll();
    void addUser(Worker user);
    void deleteWorker(int id);
    void editUser(Worker user);
    Worker getById(int id);
    Worker getByUsername(String username);

}

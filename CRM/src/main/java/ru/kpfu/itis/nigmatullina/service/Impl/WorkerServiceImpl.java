package ru.kpfu.itis.nigmatullina.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.nigmatullina.entity.Worker;
import ru.kpfu.itis.nigmatullina.repository.WorkerRepository;
import ru.kpfu.itis.nigmatullina.service.WorkerService;

import java.util.List;

/**
 * Created by ramilanigmatullina on 04.05.16.
 */
@Service
public class WorkerServiceImpl implements WorkerService {

    @Autowired
    WorkerRepository workerRepository;

    @Override
    public List<Worker> getAll() {
        return null;
    }

    @Override
    public void addUser(Worker user) {

    }

    @Override
    public void deleteWorker(int id) {

    }

    @Override
    public void editUser(Worker user) {

    }

    @Override
    public Worker getById(int id) {
        return null;
    }

    @Override
    public Worker getByUsername(String username) {
        return workerRepository.findOneByUsername(username);
    }
}

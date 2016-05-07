package ru.kpfu.itis.nigmatullina.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.nigmatullina.entity.Door;
import ru.kpfu.itis.nigmatullina.repository.DoorRepository;
import ru.kpfu.itis.nigmatullina.service.DoorService;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class DoorServiceImpl implements DoorService {

    @Autowired
    private DoorRepository doorRepository;

    @Override
    public List<Door> getAll() {
        return doorRepository.findAll();
    }

    @Override
    public Door getById(int id) {
        return doorRepository.findOne(id);
    }
}

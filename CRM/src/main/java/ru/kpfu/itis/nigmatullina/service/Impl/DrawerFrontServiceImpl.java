package ru.kpfu.itis.nigmatullina.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.nigmatullina.entity.DrawerFront;
import ru.kpfu.itis.nigmatullina.repository.DrawerFrontRepository;
import ru.kpfu.itis.nigmatullina.service.DrawerFrontService;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class DrawerFrontServiceImpl implements DrawerFrontService {

    @Autowired
    private DrawerFrontRepository drawerFrontRepository;

    @Override
    public List<DrawerFront> getAll() {
        return drawerFrontRepository.findAll();
    }

    @Override
    public DrawerFront getById(int id) {
        return drawerFrontRepository.findOne(id);
    }
}

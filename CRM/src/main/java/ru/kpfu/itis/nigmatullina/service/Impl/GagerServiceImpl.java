package ru.kpfu.itis.nigmatullina.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.nigmatullina.entity.Gager;
import ru.kpfu.itis.nigmatullina.repository.GagerRepository;
import ru.kpfu.itis.nigmatullina.service.GagerService;

import java.util.List;

/**
 * Created by ramilanigmatullina on 26.05.16.
 */
@Service
public class GagerServiceImpl implements GagerService {
    @Autowired
    private GagerRepository gagerRepository;

    @Override
    public List<Gager> getAll() {
        return gagerRepository.findAll();
    }

    @Override
    public Gager getById(int id) {
        return gagerRepository.findOne(id);
    }

    @Override
    public void addGager(Gager gager) {
        gagerRepository.save(gager);
    }

    @Override
    public void editGager(Gager gager) {
        gagerRepository.saveAndFlush(gager);
    }
}

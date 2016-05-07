package ru.kpfu.itis.nigmatullina.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.nigmatullina.entity.Leg;
import ru.kpfu.itis.nigmatullina.repository.LegRepository;
import ru.kpfu.itis.nigmatullina.service.LegService;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class LegServiceImpl implements LegService {

    @Autowired
    private LegRepository legRepository;

    @Override
    public List<Leg> getAll() {
        return legRepository.findAll();
    }

    @Override
    public Leg getById(int id) {
        return legRepository.findOne(id);
    }
}

package ru.kpfu.itis.nigmatullina.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.nigmatullina.entity.BaseCabinet;
import ru.kpfu.itis.nigmatullina.repository.BaseCabinetRepository;
import ru.kpfu.itis.nigmatullina.service.BaseCabinetService;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class BaseCabinetServiceImpl implements BaseCabinetService {

    @Autowired
    private BaseCabinetRepository baseCabineRepository;

    @Override
    public List<BaseCabinet> getAll() {
        return baseCabineRepository.findAll();
    }

    @Override
    public BaseCabinet getById(int id) {
        return baseCabineRepository.findOne(id);
    }
}

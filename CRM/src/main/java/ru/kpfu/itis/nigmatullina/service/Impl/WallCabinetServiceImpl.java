package ru.kpfu.itis.nigmatullina.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.nigmatullina.entity.WallCabinet;
import ru.kpfu.itis.nigmatullina.repository.WallCabinetRepository;
import ru.kpfu.itis.nigmatullina.service.WallCabinetService;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class WallCabinetServiceImpl implements WallCabinetService {

    @Autowired
    private WallCabinetRepository wallCabinetRepository;

    @Override
    public List<WallCabinet> getAll() {
        return wallCabinetRepository.findAll();
    }

    @Override
    public WallCabinet getById(int id) {
        return wallCabinetRepository.findOne(id);
    }
}

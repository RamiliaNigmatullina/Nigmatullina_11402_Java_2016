package ru.kpfu.itis.nigmatullina.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.nigmatullina.entity.HighCabinet;
import ru.kpfu.itis.nigmatullina.service.HighCabinetService;
import ru.kpfu.itis.nigmatullina.repository.HighCabinetRepository;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class HighCabinetServiceImpl implements HighCabinetService {

    @Autowired
    private HighCabinetRepository highCabinetRepository;

    @Override
    public List<HighCabinet> getAll() {
        return highCabinetRepository.findAll();
    }

    @Override
    public HighCabinet getById(int id) {
        return highCabinetRepository.findOne(id);
    }
}

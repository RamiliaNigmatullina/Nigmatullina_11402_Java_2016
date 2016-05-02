package ru.kpfu.itis.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.repository.WallCabinetRepository;
import ru.kpfu.itis.service.WallCabinetService;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class WallCabinetServiceImpl implements WallCabinetService {

    @Autowired
    private WallCabinetRepository wallCabinetRepository;
}

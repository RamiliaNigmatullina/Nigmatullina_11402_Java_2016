package ru.kpfu.itis.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.repository.BaseCabinetRepository;
import ru.kpfu.itis.service.BaseCabinetService;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class BaseCabinetServiceImpl implements BaseCabinetService {

    @Autowired
    private BaseCabinetRepository baseCabineRepository;
}

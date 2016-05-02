package ru.kpfu.itis.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.repository.HighCabinetRepository;
import ru.kpfu.itis.service.HighCabinetService;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class HighCabinetServiceImpl implements HighCabinetService {

    @Autowired
    private HighCabinetRepository highCabinetRepository;
}

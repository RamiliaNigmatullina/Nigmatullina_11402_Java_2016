package ru.kpfu.itis.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.repository.PlinthRepository;
import ru.kpfu.itis.service.PlinthService;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class PlinthServiceImpl implements PlinthService {

    @Autowired
    private PlinthRepository plinthRepository;
}

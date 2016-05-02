package ru.kpfu.itis.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.repository.LegRepository;
import ru.kpfu.itis.service.LegService;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class LegServiceImpl implements LegService {

    @Autowired
    private LegRepository legRepository;
}

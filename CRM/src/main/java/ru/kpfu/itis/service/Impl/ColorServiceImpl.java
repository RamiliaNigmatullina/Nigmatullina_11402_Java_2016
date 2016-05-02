package ru.kpfu.itis.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.repository.ColorRepository;
import ru.kpfu.itis.service.ColorService;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class ColorServiceImpl implements ColorService {

    @Autowired
    private ColorRepository colorServiceImplRepository;
}

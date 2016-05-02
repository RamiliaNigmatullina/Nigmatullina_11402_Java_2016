package ru.kpfu.itis.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.repository.DrawerFrontRepository;
import ru.kpfu.itis.service.DrawerFrontService;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class DrawerFrontServiceImpl implements DrawerFrontService {

    @Autowired
    private DrawerFrontRepository drawerFrontRepository;
}

package ru.kpfu.itis.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.repository.DoorRepository;
import ru.kpfu.itis.service.DoorService;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class DoorServiceImpl implements DoorService {

    @Autowired
    private DoorRepository doorRepository;
}

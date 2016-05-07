package ru.kpfu.itis.nigmatullina.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.nigmatullina.service.MaterialService;
import ru.kpfu.itis.nigmatullina.repository.MaterialRepository;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialRepository materialRepository;
}

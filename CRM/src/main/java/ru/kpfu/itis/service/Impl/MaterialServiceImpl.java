package ru.kpfu.itis.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.repository.MaterialRepository;
import ru.kpfu.itis.service.MaterialService;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class MaterialServiceImpl implements MaterialService {

    @Autowired
    private MaterialRepository materialRepository;
}

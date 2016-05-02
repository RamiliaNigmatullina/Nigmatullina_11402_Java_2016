package ru.kpfu.itis.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.repository.CabinetForBuiltInAppliancesRepository;
import ru.kpfu.itis.service.CabinetForBuiltInAppliancesService;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class CabinetForBuiltInAppliancesServiceImpl implements CabinetForBuiltInAppliancesService {

    @Autowired
    private CabinetForBuiltInAppliancesRepository cabinetForBuiltInAppliancesRepository;
}

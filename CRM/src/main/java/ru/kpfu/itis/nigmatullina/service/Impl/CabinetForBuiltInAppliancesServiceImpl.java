package ru.kpfu.itis.nigmatullina.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.nigmatullina.entity.CabinetForBuiltInAppliances;
import ru.kpfu.itis.nigmatullina.repository.CabinetForBuiltInAppliancesRepository;
import ru.kpfu.itis.nigmatullina.service.CabinetForBuiltInAppliancesService;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
@Service
public class CabinetForBuiltInAppliancesServiceImpl implements CabinetForBuiltInAppliancesService {

    @Autowired
    private CabinetForBuiltInAppliancesRepository cabinetForBuiltInAppliancesRepository;

    @Override
    public List<CabinetForBuiltInAppliances> getAll() {
        return cabinetForBuiltInAppliancesRepository.findAll();
    }

    @Override
    public CabinetForBuiltInAppliances getById(int id) {
        return cabinetForBuiltInAppliancesRepository.findOne(id);
    }
}

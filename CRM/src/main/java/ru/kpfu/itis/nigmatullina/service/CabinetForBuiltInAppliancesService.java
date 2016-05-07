package ru.kpfu.itis.nigmatullina.service;

import ru.kpfu.itis.nigmatullina.entity.CabinetForBuiltInAppliances;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
public interface CabinetForBuiltInAppliancesService {
    List<CabinetForBuiltInAppliances> getAll();
    CabinetForBuiltInAppliances getById(int id);
}

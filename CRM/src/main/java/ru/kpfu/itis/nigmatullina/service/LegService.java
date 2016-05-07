package ru.kpfu.itis.nigmatullina.service;

import ru.kpfu.itis.nigmatullina.entity.Leg;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
public interface LegService {
    List<Leg> getAll();
    Leg getById(int id);
}

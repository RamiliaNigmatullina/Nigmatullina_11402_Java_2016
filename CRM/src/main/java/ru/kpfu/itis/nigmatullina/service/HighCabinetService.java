package ru.kpfu.itis.nigmatullina.service;

import ru.kpfu.itis.nigmatullina.entity.HighCabinet;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
public interface HighCabinetService {
    List<HighCabinet> getAll();
    HighCabinet getById(int id);
}

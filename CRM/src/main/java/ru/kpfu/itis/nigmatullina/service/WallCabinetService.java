package ru.kpfu.itis.nigmatullina.service;

import ru.kpfu.itis.nigmatullina.entity.WallCabinet;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
public interface WallCabinetService {
    List<WallCabinet> getAll();
    WallCabinet getById(int id);
}

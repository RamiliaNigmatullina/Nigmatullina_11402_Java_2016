package ru.kpfu.itis.nigmatullina.service;

import ru.kpfu.itis.nigmatullina.entity.BaseCabinet;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
public interface BaseCabinetService {

    List<BaseCabinet> getAll();
    BaseCabinet getById(int id);
}

package ru.kpfu.itis.nigmatullina.service;

import ru.kpfu.itis.nigmatullina.entity.Gager;

import java.util.List;

/**
 * Created by ramilanigmatullina on 26.05.16.
 */
public interface GagerService {
    List<Gager> getAll();
    Gager getById(int id);
    void addGager(Gager gager);
    void editGager(Gager gager);
}

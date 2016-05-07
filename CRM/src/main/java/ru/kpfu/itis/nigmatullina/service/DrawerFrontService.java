package ru.kpfu.itis.nigmatullina.service;

import ru.kpfu.itis.nigmatullina.entity.DrawerFront;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
public interface DrawerFrontService {
    List<DrawerFront> getAll();
    DrawerFront getById(int id);
}

package ru.kpfu.itis.nigmatullina.service;

import ru.kpfu.itis.nigmatullina.entity.Door;

import java.util.List;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
public interface DoorService {
    List<Door> getAll();
    Door getById(int id);
}

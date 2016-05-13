package ru.kpfu.itis.nigmatullina.service;

import ru.kpfu.itis.nigmatullina.entity.Basket;
import ru.kpfu.itis.nigmatullina.entity.User;

import java.util.List;

/**
 * Created by ramilanigmatullina on 10.05.16.
 */
public interface BasketService {
    List<Basket> getItemsByUserId(User userId);
    void addBasket(Basket basket);
}

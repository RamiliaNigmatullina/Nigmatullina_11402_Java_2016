package ru.kpfu.itis.nigmatullina.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.nigmatullina.entity.Basket;
import ru.kpfu.itis.nigmatullina.entity.User;
import ru.kpfu.itis.nigmatullina.repository.BasketRepository;
import ru.kpfu.itis.nigmatullina.service.BasketService;

import java.util.List;

/**
 * Created by ramilanigmatullina on 10.05.16.
 */
@Service
public class BasketServiceImpl implements BasketService {

    @Autowired
    BasketRepository basketRepository;

    @Override
    public List<Basket> getItemsByUserId(User userId) {
        return basketRepository.findByUserId(userId);
    }

    @Override
    public void addBasket(Basket basket) {
        //userRepository.saveAndFlush(user);
        basketRepository.save(basket);
    }
}

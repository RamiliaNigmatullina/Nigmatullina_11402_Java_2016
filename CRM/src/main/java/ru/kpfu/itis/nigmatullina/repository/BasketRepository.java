package ru.kpfu.itis.nigmatullina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.nigmatullina.entity.Basket;
import ru.kpfu.itis.nigmatullina.entity.User;

import java.util.List;

/**
 * Created by ramilanigmatullina on 10.05.16.
 */
public interface BasketRepository extends JpaRepository<Basket, Integer> {
    List<Basket> findByUserId(User userId);
}

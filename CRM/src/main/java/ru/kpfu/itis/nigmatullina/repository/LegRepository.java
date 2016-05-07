package ru.kpfu.itis.nigmatullina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.nigmatullina.entity.Leg;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
public interface LegRepository extends JpaRepository<Leg, Integer> {
}

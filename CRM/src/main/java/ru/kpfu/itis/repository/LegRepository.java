package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.entity.Leg;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
public interface LegRepository extends JpaRepository<Leg, Integer> {
}

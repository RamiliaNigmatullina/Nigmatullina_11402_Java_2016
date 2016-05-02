package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.entity.BaseCabinet;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
public interface BaseCabinetRepository extends JpaRepository<BaseCabinet, Integer> {
}

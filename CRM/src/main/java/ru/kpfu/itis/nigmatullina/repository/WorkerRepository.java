package ru.kpfu.itis.nigmatullina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.nigmatullina.entity.Worker;

/**
 * Created by ramilanigmatullina on 04.05.16.
 */
public interface WorkerRepository extends JpaRepository<Worker, Integer> {

    Worker findOneByUsername(String username);
}

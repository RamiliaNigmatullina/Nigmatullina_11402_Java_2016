package ru.kpfu.itis.nigmatullina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.nigmatullina.entity.User;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    User findOneByUsername(String username);

}

package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.entity.User;

/**
 * Created by ramilanigmatullina on 19.04.16.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    /*@Query("select u from User u where u.name = :name")
    User findByName(@Param("name") String name);*/
}

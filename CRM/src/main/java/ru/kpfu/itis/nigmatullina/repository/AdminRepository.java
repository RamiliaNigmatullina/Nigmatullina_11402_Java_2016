package ru.kpfu.itis.nigmatullina.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.nigmatullina.entity.Admin;

/**
 * Created by ramilanigmatullina on 05.05.16.
 */
public interface AdminRepository extends JpaRepository<Admin, Integer>  {

    Admin findOneByUsername(String username);
}

package ru.kpfu.itis.nigmatullina.service;

import ru.kpfu.itis.nigmatullina.entity.Admin;

/**
 * Created by ramilanigmatullina on 05.05.16.
 */
public interface AdminService {

    Admin getByUsername(String username);
}

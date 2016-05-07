package ru.kpfu.itis.nigmatullina.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import ru.kpfu.itis.nigmatullina.entity.Admin;
import ru.kpfu.itis.nigmatullina.repository.AdminRepository;
import ru.kpfu.itis.nigmatullina.service.AdminService;

/**
 * Created by ramilanigmatullina on 05.05.16.
 */
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    public Admin getByUsername(String username) {
        return adminRepository.findOneByUsername(username);
    }
}

package ru.kpfu.itis.nigmatullina.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.kpfu.itis.nigmatullina.entity.Admin;
import ru.kpfu.itis.nigmatullina.entity.User;
import ru.kpfu.itis.nigmatullina.entity.Worker;
import ru.kpfu.itis.nigmatullina.service.AdminService;
import ru.kpfu.itis.nigmatullina.service.Impl.AdminServiceImpl;
import ru.kpfu.itis.nigmatullina.service.Impl.UserServiceImpl;
import ru.kpfu.itis.nigmatullina.service.Impl.WorkerServiceImpl;
import ru.kpfu.itis.nigmatullina.service.UserService;
import ru.kpfu.itis.nigmatullina.service.WorkerService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ramilanigmatullina on 04.05.16.
 */
public class AuthProviderImpl implements AuthenticationProvider {

    @Autowired
    UserServiceImpl userService;

    @Autowired
    WorkerServiceImpl workerService;

    @Autowired
    AdminServiceImpl adminService;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        User user = (User) userService.getByUsername(username);
        Worker worker = (Worker) workerService.getByUsername(username);
        Admin admin = (Admin) adminService.getByUsername(username);

        if (user == null && worker == null && admin == null)
            throw new UsernameNotFoundException("Пользователя с таким именем не существует.");

        String password = authentication.getCredentials().toString();

        if (user != null) {
            if (!encoder.matches(password, user.getPassword()))
                throw new BadCredentialsException("Неверный пароль.");
        }

        if (worker != null) {
            if (!encoder.matches(password, worker.getPassword()))
                throw new BadCredentialsException("Неверный пароль.");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        if (user != null) {
            authorities.add(new SimpleGrantedAuthority(user.getRole().toString()));
            return new UsernamePasswordAuthenticationToken(user, null, authorities);
        }

        if (worker != null) {
            authorities.add(new SimpleGrantedAuthority(worker.getRole().toString()));
            return new UsernamePasswordAuthenticationToken(worker, null, authorities);
        }

        return null;
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}

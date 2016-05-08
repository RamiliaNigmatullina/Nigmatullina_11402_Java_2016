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
import ru.kpfu.itis.nigmatullina.entity.enums.Role;
import ru.kpfu.itis.nigmatullina.repository.AdminRepository;
import ru.kpfu.itis.nigmatullina.repository.UserRepository;
import ru.kpfu.itis.nigmatullina.repository.WorkerRepository;
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
    UserRepository userRepository;

    @Autowired
    WorkerRepository workerRepository;

    @Autowired
    AdminRepository adminRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        User user = userRepository.findOneByUsername(username);
        Worker worker = workerRepository.findOneByUsername(username);
        Admin admin = adminRepository.findOneByUsername(username);

        if (user == null && worker == null && admin == null)
            throw new UsernameNotFoundException("Пользователя с таким именем не существует");

        if (user != null) {
            if (!encoder.matches(password, user.getPassword()))
                throw new BadCredentialsException("Неверный пароль");
        } else if (worker != null) {
            if (!encoder.matches(password, worker.getPassword()))
                throw new BadCredentialsException("Неверный пароль");
        } else {
            if (!encoder.matches(password, admin.getPassword()))
                throw new BadCredentialsException("Неверный пароль");
        }

        List<GrantedAuthority> authorities = new ArrayList<>();
        if (user != null) {
            authorities.add(new SimpleGrantedAuthority(user.getRole().toString()));
            return new UsernamePasswordAuthenticationToken(user, null, authorities);
        } else if (worker != null) {
            authorities.add(new SimpleGrantedAuthority(worker.getRole().toString()));
            return new UsernamePasswordAuthenticationToken(worker, null, authorities);
        }else {
            authorities.add(new SimpleGrantedAuthority(admin.getRole().toString()));
            return new UsernamePasswordAuthenticationToken(admin, null, authorities);
        }
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}

package ru.kpfu.itis.nigmatullina.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.kpfu.itis.nigmatullina.entity.Worker;
import ru.kpfu.itis.nigmatullina.entity.enums.Role;

/**
 * Created by ramilanigmatullina on 07.05.16.
 */
public class WorkerRegFormToWorkerTransf {
    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public static Worker transf(WorkerRegForm workerRegForm) {
        Worker worker = new Worker();

        worker.setUsername(workerRegForm.getUsername());
        worker.setPassword(bCryptPasswordEncoder.encode(workerRegForm.getPassword()));
        worker.setFirstName(workerRegForm.getFirstName());
        worker.setLastName(workerRegForm.getLastName());
        worker.setEmail(workerRegForm.getEmail());
        worker.setPhoneNumber(workerRegForm.getEmail());
        worker.setRole(Role.ROLE_WORKER);
        return worker;
    }
}

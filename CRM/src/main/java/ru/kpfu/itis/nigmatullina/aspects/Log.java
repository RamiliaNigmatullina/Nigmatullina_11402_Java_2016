package ru.kpfu.itis.nigmatullina.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Log {

    private Logger log = Logger.getLogger(Logger.class);

    @Before("execution(* ru.kpfu.itis.nigmatullina.controller.*.*(..))")
    public void log(JoinPoint point) {
        log.info(point.getSignature().getName() + " called");
    }
}
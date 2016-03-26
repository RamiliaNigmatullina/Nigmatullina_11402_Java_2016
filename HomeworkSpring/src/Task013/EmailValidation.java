package Task013;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task013
 */

@Aspect
public class EmailValidation {
    @Around("execution(* *..Email.setEmail(String))")
    public Object emailValidation(ProceedingJoinPoint jp) throws Throwable {
        String email = (String) jp.getArgs()[0];
        Pattern p = Pattern.compile(".+@.+\\..+");
        Matcher m = p.matcher(email);
        if (!m.matches()) return null;
        return jp.proceed();
    }
}

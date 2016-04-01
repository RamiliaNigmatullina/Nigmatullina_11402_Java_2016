package Task013;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task013
 */

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

        String realEmail = "ramilianigmatullina@gmail.com";
        String notRealEmail = "ramilianigmatullina";

        Email email1 = ac.getBean(Email.class);
        Email email2 = ac.getBean(Email.class);

        email1.setEmail(realEmail);
        email2.setEmail(notRealEmail);
    }
}

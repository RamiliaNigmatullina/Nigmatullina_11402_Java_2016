package Task011;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        // Around advice. Подсет времени, в течение которого выполняется метод getCities().
        CityRepository cr = ac.getBean(CityRepository.class);
        cr.getCities();

        System.out.println();

        // Before advice
        WantToVisitRepository wtvr = ac.getBean(WantToVisitRepository.class);
        wtvr.getWantToVisit();
    }
}

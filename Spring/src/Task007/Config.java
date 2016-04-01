package Task007;

import Task007.Classes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
@ComponentScan(basePackages = {"Task007"})
public class Config {

    @Autowired
    City city;

    @Autowired
    Theatre theatre;

    @Autowired
    Performance performance;

    @Autowired
    Seat seat;

    @Autowired
    Ticket ticket;

    @Autowired
    InternetUser internetUser;

    @Bean
    Performance performance() {
        return new Performance(
                "Золотой слон", theatre, "Александр Славутский, оставляя и где-то даже нарочито утрируя комедийный ..");
    }

    @Bean
    Human human() {
        return new Human("Liza", city, "29.06.1992");
    }

    @Bean
    InternetUser internetUser() {
        return new InternetUser("Liza", city, "29.06.1992", "liza", "liza@gmail.com", "liza");
    }

    @Bean
    public ArrayList<String> stylesDancer() {
        ArrayList<String> stylesDancer = new ArrayList<>();
        stylesDancer.add("First style");
        stylesDancer.add("Second style");
        stylesDancer.add("Third style");
        return stylesDancer;
    }

    @Bean
    public ArrayList<String> awards() {
        ArrayList<String> bestPerformances = new ArrayList<>();
        bestPerformances.add("First award");
        bestPerformances.add("Second award");
        bestPerformances.add("Third award");
        return bestPerformances;
    }

    @Bean
    public ArrayList<Performance> bestPerformances() {
        ArrayList<Performance> bestPerformances = new ArrayList<>();
        bestPerformances.add(performance());
        return bestPerformances;
    }

    @Bean
    Dancer dancer() {
     return new Dancer("Alina", city, "10.05.1990", awards(), theatre, stylesDancer());
    }

    @Bean
    Actor actor() {
        return new Actor("Robert", city, "23.04.1962", 22, bestPerformances(), awards());
    }

    @Bean
    Seat seat() {
        return new Seat(theatre, 9, 10);
    }

    @Bean
    Ticket ticket() {
        return new Ticket("White", "high", "5x12", performance, "07.01.2016", 3000, seat);
    }

    @Bean
    Viewer viewer() {
        return new Viewer("Natasha", city, "03.05.1997", performance, "12.02.2016 18:00", ticket);
    }

    @Bean
    Comment comment() {
        return new Comment("Bla", internetUser, "12.02.2016");
    }

    @Bean
    Paper paper() {
        return new Paper("White", "high", "5x12");
    }
}

package Task010;

import Task010.Classes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task010
 */

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
    City defaultCity() {
        return new City();
    }

    @Bean
    City city() {
        return new City("Казань", "Россия", 1216000);
    }

    @Bean
    Theatre defaultTheatre() {
        return new Theatre();
    }

    @Bean
    Theatre theatre() {
        return new Theatre("Казанский академический русский большой драматический театр имени В. И. Качалова",
                "http://www.teatrkachalov.ru/", city);
    }

    @Bean
    Performance defaultPerformance() {
        return new Performance();
    }

    @Bean
    Performance performance() {
        return new Performance(
                "Золотой слон", theatre, "Александр Славутский, оставляя и где-то даже нарочито утрируя комедийный ..");
    }

    @Bean
    Human defaultHuman() {
        return new Human();
    }

    @Bean
    Human human() {
        return new Human("Liza", city, "29.06.1992");
    }

    @Bean
    InternetUser defaultInternetUser() {
        return new InternetUser();
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

    private ArrayList<Performance> bestPerformances = new ArrayList<>();

    @Bean
    @Scope("singleton")
    public ArrayList<Performance> bestPerformances() {
        bestPerformances.add(performance());
        return bestPerformances;
    }

    @Bean
    Dancer defaultDancer() {
        return new Dancer();
    }

    @Bean
    Dancer dancer() {
        return new Dancer("Alina", city, "10.05.1990", awards(), theatre, stylesDancer());
    }

    @Bean
    Actor defaultActor() {
        return new Actor();
    }

    @Bean
    Actor actor() {
        return new Actor("Robert", city, "23.04.1962", 22, bestPerformances(), awards());
    }

    @Bean
    Seat defaultSeat() {
        return new Seat();
    }

    @Bean
    Seat seat() {
        return new Seat(theatre, 9, 10);
    }

    @Bean
    Ticket defaultTicket() {
        return new Ticket();
    }

    @Bean
    Ticket ticket() {
        return new Ticket("white", "high", "5x12", performance, "07.01.2016", 3000, seat);
    }

    @Bean
    Viewer defaultViewer() {
        return new Viewer();
    }

    @Bean
    Viewer viewer() {
        return new Viewer("Natasha", city, "03.05.1997", performance, "12.02.2016 18:00", ticket);
    }

    @Bean
    Comment defaultComment() {
        return new Comment();
    }

    @Bean
    Comment comment() {
        return new Comment("Bla", internetUser, "12.02.2016");
    }

    @Bean
    Paper defaultPaper() {
        return new Paper();
    }

    @Bean
    Paper paper() {
        return new Paper("white", "high", "5x12");
    }
}

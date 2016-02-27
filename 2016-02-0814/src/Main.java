import Classes.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        City philadelphia = new City("Philadelphia", "United States", 1560297);

        Human human1 = new Actor("Bradley Cooper", philadelphia, "05.01.1975", 22, null, null);
        Human human2 = new InternetUser("John", philadelphia, "19.03.1994", "john", "john@gmail.com", "12345");
        ((Actor)human1).whoAmI();
        ((InternetUser)human2).whoAmI();

        
        City city = new City("Казань", "Россия", 0);
        Theatre theatre = new Theatre(
                "Казанский академический русский большой драматический театр имени В. И. Качалова",
                "http://www.teatrkachalov.ru/", city);
        Performance performance = new Performance(
                "Золотой слон", theatre, "Александр Славутский, оставляя и где-то даже нарочито утрируя комедийный ..");
        Human human = new Human("Liza", city, "29.06.1992");
        InternetUser internetUser = new InternetUser("Liza", city, "29.06.1992", "liza", "liza@gmail.com", "liza");
        ArrayList<String> awardsDancer = new ArrayList<>();
        awardsDancer.add("sth");
        ArrayList<String> stylesDancer = new ArrayList<>();
        stylesDancer.add("sth");
        Dancer dancer = new Dancer("Alina", city, "10.05.1990", awardsDancer, theatre, stylesDancer);
        Actor actor = new Actor("Robert", philadelphia, "23.04.1962", 22, null, null);
        Seat seat = new Seat(theatre, 9, 10);
        Ticket ticket = new Ticket("White", "high", "5x12", performance, "07.01.2016", 3000, seat);
        Viewer viewer = new Viewer("Natasha", city, "03.05.1997", performance, "12.02.2016 18:00", ticket);
        Comment comment = new Comment("Bla", internetUser, "12.02.2016");
        Paper paper = new Paper("White", "high", "5x12");

        System.out.println();

        System.out.println(city.getName());
        city.getCountry();
        city.getPopulation();
        System.out.println(city);
        System.out.println(theatre.getName());
        theatre.getCity();
        theatre.getWebsite();
        System.out.println(theatre);
        System.out.println(performance.getName());
        performance.getTheatre();
        performance.getDescription();
        System.out.println(performance);
        System.out.println(human.getName());
        human.getCity();
        human.getAge();
        human.move();
        human.speak();
        human.think();
        human.eat();
        System.out.println(human);
        System.out.println(internetUser.getUsername());
        System.out.println(internetUser.getEmail());
        System.out.println(internetUser.getPassword());
        internetUser.whoAmI();
        internetUser.leaveComment(comment);
        internetUser.deleteComment(comment);
        internetUser.editComment(comment);
        internetUser.replyToComment(comment);
        internetUser.signUp();
        internetUser.signIn();
        internetUser.readPost();
        internetUser.buyTicketToPerformanceOnline(performance);
        System.out.println(internetUser);
        dancer.getTheatre();
        System.out.println(dancer.getAwards());
        dancer.getStyle();
        dancer.move(); // метод переопределен в классе Classes.Dancer
        System.out.println(dancer);
        actor.getAge();
        actor.getCity();
        System.out.println(actor.getName());
        System.out.println(actor.getTheNumberOfPerformances());
        System.out.println(actor.getBestPerformances());
        System.out.println(actor.getAwards());
        actor.readTheScript();
        actor.play();
        actor.rehearse();
        System.out.println(actor);
        System.out.println(viewer.getPerformance());
        System.out.println(viewer.getDateAndTime());
        System.out.println(viewer.getTicket());
        viewer.buyTicket();
        viewer.checkIfSeatIsFree(56);
        viewer.applaud();
        viewer.watchThePerformance(performance);
        viewer.goToTheTheatre();
        viewer.makePhotoInTheTheatre();
        viewer.admire();
        viewer.eatAtTheBuffet();
        System.out.println(viewer);
        System.out.println(paper.getColor());
        System.out.println(paper.getPaperQuality());
        System.out.println(paper.getSize());
        System.out.println(paper);
        System.out.println(seat.getTheatre());
        System.out.println(seat.getRow());
        System.out.println(seat.getSeatNumber());
        System.out.println(seat);
        System.out.println(ticket.getDate());
        System.out.println(ticket.getPerformance());
        System.out.println(ticket.getPrice());
        System.out.println(ticket.getSeat());
        ticket.buyTicket();
        ticket.checkSeat();
        ticket.checkTicket();
        ticket.printTicket();
        System.out.println(ticket);
    }
}

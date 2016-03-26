package Task006;

import Task006.Classes.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");

        City city = (City) ac.getBean("city");
        Theatre theatre = (Theatre) ac.getBean("theatre");
        Performance performance = (Performance) ac.getBean("performance");
        Human human = (Human) ac.getBean("human");
        InternetUser internetUser = (InternetUser) ac.getBean("internetUser");
        Comment comment = (Comment) ac.getBean("comment");
        Dancer dancer = (Dancer) ac.getBean("dancer");
        Actor actor = (Actor) ac.getBean("actor");
        Viewer viewer = (Viewer) ac.getBean("viewer");
        Paper paper = (Paper) ac.getBean("paper");
        Seat seat = (Seat) ac.getBean("seat");
        Ticket ticket = (Ticket) ac.getBean("ticket");

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
        dancer.getAwards();
        dancer.getStyle();
        dancer.move(); // метод переопределен в классе Classes.Dancer
        System.out.println(dancer);
        actor.getAge();
        actor.getCity();
        System.out.println(actor.getName());
        System.out.println(actor.getTheNumberOfPerformances());
        actor.getBestPerformances();
        actor.getAwards();
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

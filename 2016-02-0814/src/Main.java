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
        Viewer viewer = new Viewer("Natasha", city, "03.05.1997", performance, "12.02.2016 18:00", 56);
        Comment comment = new Comment("Bla", internetUser, "12.02.2016");
        Paper paper = new Paper("White", "high", "5x12");
        Ticket ticket = new Ticket("White", "high", "5x12", performance, 24, "07.01.2016");

        System.out.println();

        city.getName();
        city.getCountry();
        city.getPopulation();
        theatre.getName();
        theatre.getCity();
        theatre.getWebsite();
        performance.getName();
        performance.getTheatre();
        performance.getDescription();
        human.getName();
        human.getCity();
        human.getAge();
        human.move();
        human.speak();
        human.think();
        human.eat();
        internetUser.getUsername();
        internetUser.getEmail();
        internetUser.getPassword();
        internetUser.whoAmI();
        internetUser.leaveComment(comment);
        internetUser.deleteComment(comment);
        internetUser.editComment(comment);
        internetUser.replyToComment(comment);
        internetUser.signUp();
        internetUser.signIn();
        internetUser.readPost();
        internetUser.buyTicketToPerformanceOnline(performance);
        dancer.getTheatre();
        dancer.getAwards();
        dancer.getStyle();
        dancer.move(); // метод переопределен в классе Dancer
        actor.getAge();
        actor.getCity();
        actor.getName();
        actor.readTheScript();
        actor.play();
        actor.rehearse();
        viewer.getPerformance();
        viewer.getSeatNumber();
        viewer.getDateAndTime();
        viewer.buyTicket();
        viewer.checkIfSeatIsFree(56);
        viewer.applaud();
        viewer.watchThePerformance(performance);
        viewer.goToTheTheatre();
        viewer.makePhotoInTheTheatre();
        viewer.admire();
        viewer.eatAtTheBuffet();
        paper.getColor();
        paper.getPaperQuality();
        paper.getSize();
        ticket.getDate();
        ticket.getPerformance();
        ticket.getSeat();
        ticket.buyTicket();
        ticket.checkSeat();
        ticket.checkTicket();
        ticket.printTicket();
    }
}

package Classes;

import Interfaces.ForPerformance;
import Interfaces.ForTheatre;

public class Viewer extends Human implements ForPerformance, ForTheatre {
    Performance performance;
    String dateAndTime;
    Ticket ticket;

    public Viewer() {
    }

    public Viewer(String name, City city, String dateOfBirth, Performance performance, String dateAndTime, Ticket ticket) {
        super(name, city, dateOfBirth);
        this.performance = performance;
        this.dateAndTime = dateAndTime;
        this.ticket = ticket;
    }

    public Performance getPerformance() {
        return performance;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public Ticket getTicket() {
        return ticket;
    }

    @Override
    public void buyTicket() {
        System.out.println("A ticket is purchased.");
    }

    @Override
    public void checkIfSeatIsFree(int seatNumber) {
        System.out.println("This seat is free.");
    }

    @Override
    public void applaud() {
        System.out.println("Bravo! Well done!");
    }

    @Override
    public void watchThePerformance(Performance performance) {
        System.out.println("I'm watching");
    }

    @Override
    public void goToTheTheatre() {
        System.out.println("We are going to the theatre.");
    }

    @Override
    public void makePhotoInTheTheatre() {
        System.out.println("We made a photo.");
    }

    @Override
    public void admire() {
        System.out.println("Wow.");
    }

    @Override
    public void eatAtTheBuffet() {
        System.out.println("Hm, it's tasty.");
    }

    @Override
    public String toString() {
        return "My name is " + this.name + ". I'm a viewer.";
    }
}

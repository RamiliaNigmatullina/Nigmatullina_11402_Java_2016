package Task006.Classes;

import Task006.Interfaces.ForTicket;

public class Ticket extends Paper implements ForTicket {
    Performance performance;
    String date;
    int price;
    Seat seat;

    public Ticket() {
    }

    public Ticket(String color, String paperQuality, String size, Performance performance, String date, int price, Seat seat) {
        super(color, paperQuality, size);
        this.performance = performance;
        this.date = date;
        this.price = price;
        this.seat = seat;
    }

    public Performance getPerformance() {
        return performance;
    }

    public String getDate() {
        return date;
    }

    public int getPrice() {
        return price;
    }

    public Seat getSeat() {
        return seat;
    }

    @Override
    public void printTicket() {
        System.out.println("Done.");
    }

    @Override
    public void checkTicket() {
        System.out.println("All right.");
    }

    @Override
    public void buyTicket() {
        System.out.println("Your tickets. Thank you for your purchase.");
    }

    @Override
    public void checkSeat() {
        System.out.println("Our place is ...");
    }

    @Override
    public String toString() {
        return "It's a ticket.";
    }
}

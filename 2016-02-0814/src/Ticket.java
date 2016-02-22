public class Ticket extends Paper implements ForTicket {
    Performance performance;
    int seat;
    String date;

    public Ticket() {
    }

    public Ticket(String color, String paperQuality, String size, Performance performance, int seat, String date) {
        super(color, paperQuality, size);
        this.performance = performance;
        this.seat = seat;
        this.date = date;
    }

    public Performance getPerformance() {
        return performance;
    }

    public void setPerformance(Performance performance) {
        this.performance = performance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
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
        System.out.println("Here are your tickets. Thank you for your purchase.");
    }

    @Override
    public void checkSeat() {
        System.out.println("Our place is ...");
    }
}

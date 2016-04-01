package Task007.Classes;

public class Seat {
    Theatre theatre;
    int seatNumber;
    int row;

    public Seat() {
    }

    public Seat(Theatre theatre, int seatNumber, int row) {
        this.theatre = theatre;
        this.seatNumber = seatNumber;
        this.row = row;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public int getRow() {
        return row;
    }


    @Override
    public String toString() {
        return theatre + " ряд " + row + " место " + seatNumber + ".";
    }
}

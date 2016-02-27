package Tests;

import Classes.Seat;
import Classes.Theatre;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task004
 */

public class SeatTest {

    @Test
    public void defaultInternetUserShouldHaveNullTheatre() {
        Seat seat = new Seat();
        Assert.assertEquals(null, seat.getTheatre());
    }

    @Test
    public void defaultInternetUserShouldHaveNullSeatNumber() {
        Seat seat = new Seat();
        Assert.assertEquals(0, seat.getSeatNumber());
    }

    @Test
    public void defaultInternetUserShouldHaveNullRow() {
        Seat seat = new Seat();
        Assert.assertEquals(0, seat.getRow());
    }

    @Test
    public void constructorShouldSaveGivenTheatre() {
        Theatre theatre = mock(Theatre.class);
        Seat seat = new Seat(theatre, 9, 10);
        Assert.assertEquals(theatre, seat.getTheatre());
    }

    @Test
    public void constructorShouldSaveGivenSeatNumber() {
        Theatre theatre = mock(Theatre.class);
        Seat seat = new Seat(theatre, 9, 10);
        Assert.assertEquals(9, seat.getSeatNumber());
    }

    @Test
    public void constructorShouldSaveGivenRow() {
        Theatre theatre = mock(Theatre.class);
        Seat seat = new Seat(theatre, 9, 10);
        Assert.assertEquals(10, seat.getRow());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        Theatre theatre = mock(Theatre.class);
        Seat seat = new Seat(theatre, 9, 10);
        Assert.assertEquals(seat.getTheatre() + " ряд " + seat.getRow() + " место " + seat.getSeatNumber() + ".",
                seat.toString());
    }
}

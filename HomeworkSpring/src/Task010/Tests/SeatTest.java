package Task010.Tests;

import Task010.Classes.Seat;
import Task010.Classes.Theatre;
import Task010.Config;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task010
 */

public class SeatTest {
    private static Seat defaultSeat;
    private static Seat seat;
    private static Theatre theatre;

    @BeforeClass
    public static void beforeClass(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        defaultSeat = (Seat) ac.getBean("defaultSeat");
        seat = (Seat) ac.getBean("seat");
        theatre = (Theatre) ac.getBean("theatre");
    }

    @Test
    public void defaultInternetUserShouldHaveNullTheatre() {
        Assert.assertEquals(null, defaultSeat.getTheatre());
    }

    @Test
    public void defaultInternetUserShouldHaveNullSeatNumber() {
        Assert.assertEquals(0, defaultSeat.getSeatNumber());
    }

    @Test
    public void defaultInternetUserShouldHaveNullRow() {
        Assert.assertEquals(0, defaultSeat.getRow());
    }

    @Test
    public void constructorShouldSaveGivenTheatre() {
        Assert.assertEquals(theatre, seat.getTheatre());
    }

    @Test
    public void constructorShouldSaveGivenSeatNumber() {
        Assert.assertEquals(9, seat.getSeatNumber());
    }

    @Test
    public void constructorShouldSaveGivenRow() {
        Assert.assertEquals(10, seat.getRow());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        Assert.assertEquals(seat.getTheatre() + " ряд " + seat.getRow() + " место " + seat.getSeatNumber() + ".",
                seat.toString());
    }
}

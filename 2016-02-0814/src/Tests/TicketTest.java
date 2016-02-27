package Tests;

import Classes.Performance;
import Classes.Seat;
import Classes.Ticket;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task004
 */

public class TicketTest {

    @Test
    public void defaultTicketShouldHaveNullPaperQuality() {
        Ticket ticket = new Ticket();
        Assert.assertEquals(null, ticket.getPaperQuality());
    }

    @Test
    public void defaultTicketShouldHaveNullSize() {
        Ticket ticket = new Ticket();
        Assert.assertEquals(null, ticket.getSize());
    }

    @Test
    public void defaultTicketShouldHaveNullColor() {
        Ticket ticket = new Ticket();
        Assert.assertEquals(null, ticket.getColor());
    }

    @Test
    public void defaultTicketShouldHaveNullTheatre() {
        Ticket ticket = new Ticket();
        Assert.assertEquals(null, ticket.getPerformance());
    }

    @Test
    public void defaultTicketShouldHaveNullDate() {
        Ticket ticket = new Ticket();
        Assert.assertEquals(null, ticket.getDate());
    }

    @Test
    public void defaultTicketShouldHaveNullSeat() {
        Ticket ticket = new Ticket();
        Assert.assertEquals(null, ticket.getSeat());
    }

    @Test
    public void defaultTicketShouldHaveNullPrice() {
        Ticket ticket = new Ticket();
        Assert.assertEquals(0, ticket.getPrice());
    }


    @Test
    public void constructorShouldSaveGivenPaperQuality() {
        Performance performance = mock(Performance.class);
        Seat seat = mock(Seat.class);
        Ticket ticket = new Ticket("white", "high", "5x12", performance, "07.01.2016", 3000, seat);
        Assert.assertEquals("high", ticket.getPaperQuality());
    }

    @Test
    public void constructorShouldSaveGivenSize() {
        Performance performance = mock(Performance.class);
        Seat seat = mock(Seat.class);
        Ticket ticket = new Ticket("white", "high", "5x12", performance, "07.01.2016", 3000, seat);
        Assert.assertEquals("5x12", ticket.getSize());
    }

    @Test
    public void constructorShouldSaveGivenColor() {
        Performance performance = mock(Performance.class);
        Seat seat = mock(Seat.class);
        Ticket ticket = new Ticket("white", "high", "5x12", performance, "07.01.2016", 3000, seat);
        Assert.assertEquals("white", ticket.getColor());
    }

    @Test
    public void constructorShouldSaveGivenPerformance() {
        Performance performance = mock(Performance.class);
        Seat seat = mock(Seat.class);
        Ticket ticket = new Ticket("white", "high", "5x12", performance, "07.01.2016", 3000, seat);
        Assert.assertEquals(performance, ticket.getPerformance());
    }

    @Test
    public void constructorShouldSaveGivenDate() {
        Performance performance = mock(Performance.class);
        Seat seat = mock(Seat.class);
        Ticket ticket = new Ticket("white", "high", "5x12", performance, "07.01.2016", 3000, seat);
        Assert.assertEquals("07.01.2016", ticket.getDate());
    }

    @Test
    public void constructorShouldSaveGivenSeat() {
        Performance performance = mock(Performance.class);
        Seat seat = mock(Seat.class);
        Ticket ticket = new Ticket("white", "high", "5x12", performance, "07.01.2016", 3000, seat);
        Assert.assertEquals(seat, ticket.getSeat());
    }

    @Test
    public void constructorShouldSaveGivenPrice() {
        Performance performance = mock(Performance.class);
        Seat seat = mock(Seat.class);
        Ticket ticket = new Ticket("white", "high", "5x12", performance, "07.01.2016", 3000, seat);
        Assert.assertEquals(3000, ticket.getPrice());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        Performance performance = mock(Performance.class);
        Seat seat = mock(Seat.class);
        Ticket ticket = new Ticket("white", "high", "5x12", performance, "07.01.2016", 3000, seat);
        Assert.assertEquals("It's a ticket.", ticket.toString());
    }
}

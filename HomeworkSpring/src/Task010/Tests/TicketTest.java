package Task010.Tests;

import Task010.Classes.Performance;
import Task010.Classes.Seat;
import Task010.Classes.Ticket;
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

public class TicketTest {
    private static Ticket defaultTicket;
    private static Ticket ticket;
    private static Performance performance;
    private static Seat seat;

    @BeforeClass
    public static void beforeClass(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        defaultTicket = (Ticket) ac.getBean("defaultTicket");
        ticket = (Ticket) ac.getBean("ticket");
        performance = (Performance) ac.getBean("performance");
        seat = (Seat) ac.getBean("seat");
    }

    @Test
    public void defaultTicketShouldHaveNullPaperQuality() {
        Assert.assertEquals(null, defaultTicket.getPaperQuality());
    }

    @Test
    public void defaultTicketShouldHaveNullSize() {
        Assert.assertEquals(null, defaultTicket.getSize());
    }

    @Test
    public void defaultTicketShouldHaveNullColor() {
        Assert.assertEquals(null, defaultTicket.getColor());
    }

    @Test
    public void defaultTicketShouldHaveNullTheatre() {
        Assert.assertEquals(null, defaultTicket.getPerformance());
    }

    @Test
    public void defaultTicketShouldHaveNullDate() {
        Assert.assertEquals(null, defaultTicket.getDate());
    }

    @Test
    public void defaultTicketShouldHaveNullSeat() {
        Assert.assertEquals(null, defaultTicket.getSeat());
    }

    @Test
    public void defaultTicketShouldHaveNullPrice() {
        Assert.assertEquals(0, defaultTicket.getPrice());
    }

    @Test
    public void constructorShouldSaveGivenPaperQuality() {
        Assert.assertEquals("high", ticket.getPaperQuality());
    }

    @Test
    public void constructorShouldSaveGivenSize() {
        Assert.assertEquals("5x12", ticket.getSize());
    }

    @Test
    public void constructorShouldSaveGivenColor() {
        Assert.assertEquals("white", ticket.getColor());
    }

    @Test
    public void constructorShouldSaveGivenPerformance() {
        Assert.assertEquals(performance, ticket.getPerformance());
    }

    @Test
    public void constructorShouldSaveGivenDate() {
        Assert.assertEquals("07.01.2016", ticket.getDate());
    }

    @Test
    public void constructorShouldSaveGivenSeat() {
        Assert.assertEquals(seat, ticket.getSeat());
    }

    @Test
    public void constructorShouldSaveGivenPrice() {
        Assert.assertEquals(3000, ticket.getPrice());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        Assert.assertEquals("It's a ticket.", ticket.toString());
    }
}

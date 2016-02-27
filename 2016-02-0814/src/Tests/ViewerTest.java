package Tests;

import Classes.*;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task004
 */

public class ViewerTest {
    @Test
    public void defaultViewerShouldHaveNullPerformance() {
        Viewer viewer = new Viewer();
        Assert.assertEquals(null, viewer.getPerformance());
    }

    @Test
    public void defaultTicketShouldHaveNullDateAndTime() {
        Viewer viewer = new Viewer();
        Assert.assertEquals(null, viewer.getDateAndTime());
    }

    @Test
    public void defaultTicketShouldHaveNullTicket() {
        Viewer viewer = new Viewer();
        Assert.assertEquals(null, viewer.getTicket());
    }

    @Test
    public void constructorShouldSaveGivenPerformance() {
        Performance performance = mock(Performance.class);
        City city = mock(City.class);
        Ticket ticket = mock(Ticket.class);
        Viewer viewer = new Viewer("Natasha", city, "03.05.1997", performance, "12.02.2016 18:00", ticket);
        Assert.assertEquals(performance, viewer.getPerformance());
    }

    @Test
    public void constructorShouldSaveGivenDateAndTime() {
        Performance performance = mock(Performance.class);
        City city = mock(City.class);
        Ticket ticket = mock(Ticket.class);
        Viewer viewer = new Viewer("Natasha", city, "03.05.1997", performance, "12.02.2016 18:00", ticket);
        Assert.assertEquals("12.02.2016 18:00", viewer.getDateAndTime());
    }

    @Test
    public void constructorShouldSaveGivenTicket() {
        Performance performance = mock(Performance.class);
        City city = mock(City.class);
        Ticket ticket = mock(Ticket.class);
        Viewer viewer = new Viewer("Natasha", city, "03.05.1997", performance, "12.02.2016 18:00", ticket);
        Assert.assertEquals(ticket, viewer.getTicket());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        Performance performance = mock(Performance.class);
        City city = mock(City.class);
        Ticket ticket = mock(Ticket.class);
        Viewer viewer = new Viewer("Natasha", city, "03.05.1997", performance, "12.02.2016 18:00", ticket);
        Assert.assertEquals("My name is " + viewer.getName() + ". I'm a viewer.", viewer.toString());
    }
}

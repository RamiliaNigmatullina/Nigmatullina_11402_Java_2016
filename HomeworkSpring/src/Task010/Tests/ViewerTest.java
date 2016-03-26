package Task010.Tests;

import Task010.Classes.Performance;
import Task010.Classes.Ticket;
import Task010.Classes.Viewer;
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

public class ViewerTest {
    private static Viewer defaultViewer;
    private static Viewer viewer;
    private static Performance performance;
    private static Ticket ticket;

    @BeforeClass
    public static void beforeClass(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        defaultViewer = (Viewer) ac.getBean("defaultViewer");
        viewer = (Viewer) ac.getBean("viewer");
        performance = (Performance) ac.getBean("performance");
        ticket = (Ticket) ac.getBean("ticket");
    }

    @Test
    public void defaultViewerShouldHaveNullPerformance() {
        Assert.assertEquals(null, defaultViewer.getPerformance());
    }

    @Test
    public void defaultTicketShouldHaveNullDateAndTime() {
        Assert.assertEquals(null, defaultViewer.getDateAndTime());
    }

    @Test
    public void defaultTicketShouldHaveNullTicket() {
        Assert.assertEquals(null, defaultViewer.getTicket());
    }

    @Test
    public void constructorShouldSaveGivenPerformance() {
        Assert.assertEquals(performance, viewer.getPerformance());
    }

    @Test
    public void constructorShouldSaveGivenDateAndTime() {
        Assert.assertEquals("12.02.2016 18:00", viewer.getDateAndTime());
    }

    @Test
    public void constructorShouldSaveGivenTicket() {
        Assert.assertEquals(ticket, viewer.getTicket());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        Assert.assertEquals("My name is " + viewer.getName() + ". I'm a viewer.", viewer.toString());
    }
}

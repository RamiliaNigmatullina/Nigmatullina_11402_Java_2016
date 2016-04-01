package Task010.Tests;

import Task010.Classes.Paper;
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

public class PaperTest {
    private static Paper defaultPaper;
    private static Paper paper;

    @BeforeClass
    public static void beforeClass(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        defaultPaper = (Paper) ac.getBean("defaultPaper");
        paper = (Paper) ac.getBean("paper");
    }

    @Test
    public void defaultPaperShouldHaveNullPaperQuality() {
        Assert.assertEquals(null, defaultPaper.getPaperQuality());
    }

    @Test
    public void defaultPaperShouldHaveNullSize() {
        Assert.assertEquals(null, defaultPaper.getSize());
    }

    @Test
    public void defaultPaperShouldHaveNullColor() {
        Assert.assertEquals(null, defaultPaper.getColor());
    }

    @Test
    public void constructorShouldSaveGivenPaperQuality() {
        Assert.assertEquals("high", paper.getPaperQuality());
    }

    @Test
    public void constructorShouldSaveGivenSize() {
        Assert.assertEquals("5x12", paper.getSize());
    }

    @Test
    public void constructorShouldSaveGivenColor() {
        Assert.assertEquals("white", paper.getColor());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        Assert.assertEquals("It's a simple piece of paper.", paper.toString());
    }
}

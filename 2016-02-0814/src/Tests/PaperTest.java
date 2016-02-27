package Tests;

import Classes.Paper;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task004
 */

public class PaperTest {

    @Test
    public void defaultPaperShouldHaveNullPaperQuality() {
        Paper paper = new Paper();
        Assert.assertEquals(null, paper.getPaperQuality());
    }

    @Test
    public void defaultPaperShouldHaveNullSize() {
        Paper paper = new Paper();
        Assert.assertEquals(null, paper.getSize());
    }

    @Test
    public void defaultPaperShouldHaveNullColor() {
        Paper paper = new Paper();
        Assert.assertEquals(null, paper.getColor());
    }

    @Test
    public void constructorShouldSaveGivenPaperQuality() {
        Paper paper = new Paper("white", "high", "5x12");
        Assert.assertEquals("high", paper.getPaperQuality());
    }

    @Test
    public void constructorShouldSaveGivenSize() {
        Paper paper = new Paper("white", "high", "5x12");
        Assert.assertEquals("5x12", paper.getSize());
    }

    @Test
    public void constructorShouldSaveGivenColor() {
        Paper paper = new Paper("white", "high", "5x12");
        Assert.assertEquals("white", paper.getColor());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        Paper paper = new Paper("white", "high", "5x12");
        Assert.assertEquals("It's a simple piece of paper.", paper.toString());
    }
}

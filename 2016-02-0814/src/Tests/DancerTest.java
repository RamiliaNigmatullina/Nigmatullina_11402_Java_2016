package Tests;

import Classes.City;
import Classes.Dancer;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task004
 */

public class DancerTest {

    @Test
    public void defaultDancerShouldHaveNullName() {
        Dancer dancer = new Dancer();
        Assert.assertEquals(null, dancer.getName());
    }

    @Test
    public void defaultDancerShouldHaveNullAwards() {
        Dancer dancer = new Dancer();
        Assert.assertEquals(null, dancer.getAwards());
    }

    @Test
    public void constructorShouldSaveNameAlina() {
        City city = mock(City.class);
        Dancer dancer = new Dancer("Alina", city, "10.05.1990", null, null, null);
        Assert.assertEquals("Alina", dancer.getName());
    }

    @Test
    public void constructorShouldSaveNameAwards() {
        ArrayList awards = mock(ArrayList.class);
        City city = mock(City.class);
        Dancer dancer = new Dancer("Alina", city, "10.05.1990", awards, null, null);
        Assert.assertEquals(awards, dancer.getAwards());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        ArrayList awards = mock(ArrayList.class);
        City city = mock(City.class);
        Dancer dancer = new Dancer("Alina", city, "10.05.1990", awards, null, null);
        Assert.assertEquals("My name is " + dancer.getName() + ". I'm a dancer.", dancer.toString());
    }
}

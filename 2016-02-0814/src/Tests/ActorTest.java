package Tests;

import Classes.Actor;
import Classes.City;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task004
 */

public class ActorTest {

    @Test
    public void defaultActorShouldHaveNullName() {
        Actor actor = new Actor();
        Assert.assertEquals(null, actor.getName());
    }

    @Test
    public void constructorShouldSaveNameRobert() {
        City city = mock(City.class);
        Actor actor = new Actor("Robert", city, "23.04.1962", 22, null, null);
        Assert.assertEquals("Robert", actor.getName());
    }

    @Test
    public void constructorShouldSaveGivenNumberOfPerformances() {
        City city = mock(City.class);
        Actor actor = new Actor("Robert", city, "23.04.1962", 22, null, null);
        Assert.assertEquals(22, actor.getTheNumberOfPerformances());
    }

    @Test
    public void constructorShouldSaveGivenBestPerformances() {
        City city = mock(City.class);
        ArrayList bestPerformances = mock(ArrayList.class);
        Actor actor = new Actor("Robert", city, "23.04.1962", 22, bestPerformances, null);
        Assert.assertEquals(bestPerformances, actor.getBestPerformances());
    }

    @Test
    public void constructorShouldSaveGivenArrayListAwards() {
        City city = mock(City.class);
        ArrayList awards = mock(ArrayList.class);
        Actor actor = new Actor("Robert", city, "23.04.1962", 22, null, awards);
        Assert.assertEquals(awards, actor.getAwards());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        City city = mock(City.class);
        ArrayList awards = mock(ArrayList.class);
        Actor actor = new Actor("Robert", city, "23.04.1962", 22, null, awards);
        Assert.assertEquals("My name is " + actor.getName() + ". I'm an actor.", actor.toString());
    }
}

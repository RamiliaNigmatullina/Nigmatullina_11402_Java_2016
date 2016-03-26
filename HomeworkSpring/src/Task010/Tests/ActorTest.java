package Task010.Tests;

import Task010.Classes.Actor;
import Task010.Classes.Performance;
import Task010.Config;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task010
 */

public class ActorTest {
    private static Actor defaultActor;
    private static Actor actor;
    private static ArrayList<Performance> bestPerformances;
    private static ArrayList<String> awards;

    @BeforeClass
    public static void beforeClass(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        defaultActor = (Actor) ac.getBean("defaultActor");
        actor = (Actor) ac.getBean("actor");
        bestPerformances = (ArrayList<Performance>) ac.getBean("bestPerformances");
        awards = (ArrayList<String>) ac.getBean("awards");
    }

    @Test
    public void defaultActorShouldHaveNullName() {
        Assert.assertEquals(null, defaultActor.getName());
    }

    @Test
    public void constructorShouldSaveNameRobert() {
        Assert.assertEquals("Robert", actor.getName());
    }

    @Test
    public void constructorShouldSaveGivenNumberOfPerformances() {
        Assert.assertEquals(22, actor.getTheNumberOfPerformances());
    }

    @Test
    public void constructorShouldSaveGivenBestPerformances() {
        Assert.assertEquals(bestPerformances, actor.getBestPerformances());
    }

    @Test
    public void constructorShouldSaveGivenArrayListAwards() {
        Assert.assertEquals(awards, actor.getAwards());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        Assert.assertEquals("My name is " + actor.getName() + ". I'm an actor.", actor.toString());
    }
}

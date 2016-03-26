package Task010.Tests;

import Task010.Classes.Dancer;
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

public class DancerTest {
    private static Dancer defaultDancer;
    private static Dancer dancer;
    private static ArrayList<String> awards;

    @BeforeClass
    public static void beforeClass(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        defaultDancer = (Dancer) ac.getBean("defaultDancer");
        dancer = (Dancer) ac.getBean("dancer");
        awards = (ArrayList<String>) ac.getBean("awards");
    }

    @Test
    public void defaultDancerShouldHaveNullName() {
        Assert.assertEquals(null, defaultDancer.getName());
    }

    @Test
    public void defaultDancerShouldHaveNullAwards() {
        Assert.assertEquals(null, defaultDancer.getAwards());
    }

    @Test
    public void constructorShouldSaveNameAlina() {
        Assert.assertEquals("Alina", dancer.getName());
    }

    @Test
    public void constructorShouldSaveNameAwards() {
        Assert.assertEquals(awards, dancer.getAwards());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        Assert.assertEquals("My name is " + dancer.getName() + ". I'm a dancer.", dancer.toString());
    }
}

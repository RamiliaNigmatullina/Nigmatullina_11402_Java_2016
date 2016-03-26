package Task010.Tests;

import Task010.Classes.Theatre;
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

public class TheatreTest {
    private static Theatre defaultTheatre;
    private static Theatre theatre;

    @BeforeClass
    public static void beforeClass(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        defaultTheatre = (Theatre) ac.getBean("defaultTheatre");
        theatre = (Theatre) ac.getBean("theatre");
    }

    @Test
    public void defaultTheatreShouldHaveNullName() {
        Assert.assertEquals(null, defaultTheatre.getName());
    }

    @Test
    public void constructorShouldSaveGivenName() {
        Assert.assertEquals("Казанский академический русский большой драматический театр имени В. И. Качалова",
                theatre.getName());
    }

    @Test
    public void methodToStringShouldReturnNameOfTheatre() {
        Assert.assertEquals("Казанский академический русский большой драматический театр имени В. И. Качалова",
                theatre.toString());
    }
}

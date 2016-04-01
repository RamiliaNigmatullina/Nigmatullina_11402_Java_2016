package Task010.Tests;

import Task010.Classes.Human;
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

public class HumanTest {
    private static Human defaultHuman;
    private static Human human;

    @BeforeClass
    public static void beforeClass(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        defaultHuman = (Human) ac.getBean("defaultHuman");
        human = (Human) ac.getBean("human");
    }

    @Test
    public void defaultHumanShouldHaveNullName() {
        Assert.assertEquals(null, defaultHuman.getName());
    }

    @Test
    public void constructorShouldSaveNameLiza() {
        Assert.assertEquals("Liza", human.getName());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        Assert.assertEquals("My name is " + human.getName() + ". I'm a human.", human.toString());
    }
}

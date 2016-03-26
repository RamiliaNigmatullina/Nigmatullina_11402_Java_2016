package Task010.Tests;

import Task010.Classes.Performance;
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

public class PerformanceTest {
    private static Performance defaultPerformance;
    private static Performance performance;

    @BeforeClass
    public static void beforeClass(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        defaultPerformance = (Performance) ac.getBean("defaultPerformance");
        performance = (Performance) ac.getBean("performance");
    }

    @Test
    public void defaultActorShouldHaveNullName() {
        Assert.assertEquals(null, defaultPerformance.getName());
    }

    @Test
    public void constructorShouldSaveName() {
        Assert.assertEquals("Золотой слон", performance.getName());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        Assert.assertEquals("It is a performance \"" + performance.getName() + "\".", performance.toString());
    }
}

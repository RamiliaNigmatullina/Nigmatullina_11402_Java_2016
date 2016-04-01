package Task010.Tests;

import Task010.Classes.City;
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

public class CityTest {
    private static City defaultCity;
    private static City city;

    @BeforeClass
    public static void beforeClass(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        defaultCity = (City) ac.getBean("defaultCity");
        city = (City) ac.getBean("city");
    }

    @Test
    public void defaultCityShouldHaveNullName() {
        Assert.assertEquals(null, defaultCity.getName());
    }

    @Test
    public void constructorShouldSaveCityPhiladelphia() {
        Assert.assertEquals("Казань", city.getName());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        City city = new City("Philadelphia", "United States", 1560297);
        Assert.assertEquals(city.getName(), city.toString());
    }
}

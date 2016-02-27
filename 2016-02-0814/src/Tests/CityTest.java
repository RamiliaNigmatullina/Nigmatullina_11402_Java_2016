package Tests;

import Classes.City;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task004
 */

public class CityTest {
    @Test
    public void defaultCityShouldHaveNullName() {
        City city = new City();
        Assert.assertEquals(null, city.getName());
    }

    @Test
    public void constructorShouldSaveCityPhiladelphia() {
        City city = new City("Philadelphia", "United States", 1560297);
        Assert.assertEquals("Philadelphia", city.getName());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        City city = new City("Philadelphia", "United States", 1560297);
        Assert.assertEquals(city.getName(), city.toString());
    }
}

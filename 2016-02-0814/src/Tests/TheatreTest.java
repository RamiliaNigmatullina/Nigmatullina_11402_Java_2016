package Tests;

import Classes.City;
import Classes.Theatre;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task004
 */

public class TheatreTest {

    @Test
    public void defaultTheatreShouldHaveNullName() {
        Theatre theatre = new Theatre();
        Assert.assertEquals(null, theatre.getName());
    }

    @Test
    public void constructorShouldSaveGivenName() {
        City city = mock(City.class);
        Theatre theatre = new Theatre(
                "Казанский академический русский большой драматический театр имени В. И. Качалова",
                "http://www.teatrkachalov.ru/", city);
        Assert.assertEquals("Казанский академический русский большой драматический театр имени В. И. Качалова",
                theatre.getName());
    }

    @Test
    public void methodToStringShouldReturnNameOfTheatre() {
        City city = mock(City.class);
        Theatre theatre = new Theatre(
                "Казанский академический русский большой драматический театр имени В. И. Качалова",
                "http://www.teatrkachalov.ru/", city);
        Assert.assertEquals("Казанский академический русский большой драматический театр имени В. И. Качалова",
                theatre.toString());
    }
}

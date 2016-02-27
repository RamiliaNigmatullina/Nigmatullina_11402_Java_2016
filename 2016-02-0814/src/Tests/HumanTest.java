package Tests;

import Classes.City;
import Classes.Human;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task004
 */

public class HumanTest {

    @Test
    public void defaultHumanShouldHaveNullName() {
        Human human = new Human();
        Assert.assertEquals(null, human.getName());
    }

    @Test
    public void constructorShouldSaveNameLiza() {
        City city = mock(City.class);
        Human human = new Human("Liza", city, "29.06.1992");
        Assert.assertEquals("Liza", human.getName());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        City city = mock(City.class);
        Human human = new Human("Liza", city, "29.06.1992");
        Assert.assertEquals("My name is " + human.getName() + ". I'm a human.", human.toString());
    }
}

package Tests;

import Classes.City;
import Classes.InternetUser;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task004
 */

public class InternetUserTest {

    @Test
    public void defaultInternetUserShouldHaveNullName() {
        InternetUser internetUser = new InternetUser();
        Assert.assertEquals(null, internetUser.getName());
    }

    @Test
    public void defaultInternetUserShouldHaveNullUsername() {
        InternetUser internetUser = new InternetUser();
        Assert.assertEquals(null, internetUser.getUsername());
    }

    @Test
    public void defaultInternetUserShouldHaveNullEmail() {
        InternetUser internetUser = new InternetUser();
        Assert.assertEquals(null, internetUser.getEmail());
    }

    @Test
    public void defaultInternetUserShouldHaveNullPassword() {
        InternetUser internetUser = new InternetUser();
        Assert.assertEquals(null, internetUser.getPassword());
    }

    @Test
    public void constructorShouldSaveNameLiza() {
        City city = mock(City.class);
        InternetUser internetUser = new InternetUser("Liza", city, "29.06.1992", "liza", "liza@gmail.com", "liza");
        Assert.assertEquals("Liza", internetUser.getName());
    }

    @Test
    public void constructorShouldSaveGivenUsername() {
        City city = mock(City.class);
        InternetUser internetUser = new InternetUser("Liza", city, "29.06.1992", "liza", "liza@gmail.com", "liza");
        Assert.assertEquals("liza", internetUser.getUsername());
    }

    @Test
    public void constructorShouldSaveNameEmil() {
        City city = mock(City.class);
        InternetUser internetUser = new InternetUser("Liza", city, "29.06.1992", "liza", "liza@gmail.com", "liza");
        Assert.assertEquals("liza@gmail.com", internetUser.getEmail());
    }

    @Test
    public void constructorShouldSaveNamePassword() {
        City city = mock(City.class);
        InternetUser internetUser = new InternetUser("Liza", city, "29.06.1992", "liza", "liza@gmail.com", "liza");
        Assert.assertEquals("liza", internetUser.getPassword());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        City city = mock(City.class);
        InternetUser internetUser = new InternetUser("Liza", city, "29.06.1992", "liza", "liza@gmail.com", "liza");
        Assert.assertEquals("My name is " + internetUser.getName() + ". I'm a Internet user.", internetUser.toString());
    }
}

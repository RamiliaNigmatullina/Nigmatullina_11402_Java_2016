package Task010.Tests;

import Task010.Classes.InternetUser;
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

public class InternetUserTest {
    private static InternetUser defaultInternetUser;
    private static InternetUser internetUser;

    @BeforeClass
    public static void beforeClass(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        defaultInternetUser = (InternetUser) ac.getBean("defaultInternetUser");
        internetUser = (InternetUser) ac.getBean("internetUser");
    }

    @Test
    public void defaultInternetUserShouldHaveNullName() {
        Assert.assertEquals(null, defaultInternetUser.getName());
    }

    @Test
    public void defaultInternetUserShouldHaveNullUsername() {
        Assert.assertEquals(null, defaultInternetUser.getUsername());
    }

    @Test
    public void defaultInternetUserShouldHaveNullEmail() {
        Assert.assertEquals(null, defaultInternetUser.getEmail());
    }

    @Test
    public void defaultInternetUserShouldHaveNullPassword() {
        Assert.assertEquals(null, defaultInternetUser.getPassword());
    }

    @Test
    public void constructorShouldSaveNameLiza() {
        Assert.assertEquals("Liza", internetUser.getName());
    }

    @Test
    public void constructorShouldSaveGivenUsername() {
        Assert.assertEquals("liza", internetUser.getUsername());
    }

    @Test
    public void constructorShouldSaveNameEmil() {
        Assert.assertEquals("liza@gmail.com", internetUser.getEmail());
    }

    @Test
    public void constructorShouldSaveNamePassword() {
        Assert.assertEquals("liza", internetUser.getPassword());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        Assert.assertEquals("My name is " + internetUser.getName() + ". I'm a Internet user.", internetUser.toString());
    }
}

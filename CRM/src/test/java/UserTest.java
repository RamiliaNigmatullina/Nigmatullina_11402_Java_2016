import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.kpfu.itis.nigmatullina.entity.User;
import ru.kpfu.itis.nigmatullina.repository.UserRepository;
import ru.kpfu.itis.nigmatullina.service.Impl.UserServiceImpl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ramilanigmatullina on 22.05.16.
 */
public class UserTest {

    private static UserServiceImpl userServiceImpl;
    private static User user;
    private static User defaultUser;

    @BeforeClass
    public static void before() {

        user = new User();
        user.setId(100);
        user.setUsername("user");
        user.setFirstName("User");
        user.setLastName("User");
        user.setEmail("user@gmail.com");
        user.setPassword("123456789");

        defaultUser = new User();


        userServiceImpl = new UserServiceImpl();
        UserRepository userRepository = mock(UserRepository.class);

        when(userRepository.findById(user.getId())).thenReturn(user);
        when(userRepository.findOneByUsername(user.getUsername())).thenReturn(user);

    }

    @Test
    public void methodGetUserByIdShouldReturnUser() {
        Assert.assertEquals(user, userServiceImpl.getById(user.getId()));
    }

    @Test
    public void methodGetUserByIdUsernameReturnUser() {
        Assert.assertEquals(user, userServiceImpl.getByUsername(user.getUsername()));
    }

    @Test
    public void userShouldHavePassword() {
        Assert.assertEquals("123456789", user.getPassword());
    }

    @Test
    public void defaultUserShouldHaveNullId() {
        Assert.assertEquals(null, defaultUser.getId());
    }

    @Test
    public void defaultUserShouldHaveNullUsername() {
        Assert.assertEquals(null, defaultUser.getUsername());
    }

    @Test
    public void defaultUserShouldHaveNullFirstName() {
        Assert.assertEquals(null, defaultUser.getFirstName());
    }

    @Test
    public void defaultUserShouldHaveNullLastName() {
        Assert.assertEquals(null, defaultUser.getLastName());
    }

    @Test
    public void defaultUserShouldHaveNullEmail() {
        Assert.assertEquals(null, defaultUser.getEmail());
    }

    @Test
    public void defaultUserShouldHaveNullPassword() {
        Assert.assertEquals(null, defaultUser.getPassword());
    }
}

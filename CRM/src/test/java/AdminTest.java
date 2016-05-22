import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.kpfu.itis.nigmatullina.entity.Admin;
import ru.kpfu.itis.nigmatullina.repository.AdminRepository;
import ru.kpfu.itis.nigmatullina.service.Impl.AdminServiceImpl;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ramilanigmatullina on 22.05.16.
 */
public class AdminTest {
    private static AdminServiceImpl adminServiceImpl;
    private static Admin admin;
    private static Admin defaultAdmin;

    @BeforeClass
    public static void before() {

        admin = new Admin();
        admin.setId(100);
        admin.setUsername("admin");
        admin.setFirstName("admin");
        admin.setLastName("admin");
        admin.setEmail("admin@gmail.com");
        admin.setPassword("123456789");

        defaultAdmin = new Admin();


        adminServiceImpl = new AdminServiceImpl();
        AdminRepository userRepository = mock(AdminRepository.class);

        when(userRepository.findOneByUsername(admin.getUsername())).thenReturn(admin);

    }

    @Test
    public void methodGetAdminByIdUsernameReturnUser() {
        Assert.assertEquals(admin, adminServiceImpl.getByUsername(admin.getUsername()));
    }

    @Test
    public void adminShouldHavePassword() {
        Assert.assertEquals("123456789", admin.getPassword());
    }

    @Test
    public void defaultAdminShouldHaveNullId() {
        Assert.assertEquals(null, defaultAdmin.getId());
    }

    @Test
    public void defaultAdminShouldHaveNullUsername() {
        Assert.assertEquals(null, defaultAdmin.getUsername());
    }

    @Test
    public void defaultAdminShouldHaveNullFirstName() {
        Assert.assertEquals(null, defaultAdmin.getFirstName());
    }

    @Test
    public void defaultAdminShouldHaveNullLastName() {
        Assert.assertEquals(null, defaultAdmin.getLastName());
    }

    @Test
    public void defaultAdminShouldHaveNullEmail() {
        Assert.assertEquals(null, defaultAdmin.getEmail());
    }

    @Test
    public void defaultAdminShouldHaveNullPassword() {
        Assert.assertEquals(null, defaultAdmin.getPassword());
    }
}

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.kpfu.itis.nigmatullina.entity.DrawerFront;
import ru.kpfu.itis.nigmatullina.repository.DrawerFrontRepository;
import ru.kpfu.itis.nigmatullina.service.Impl.DrawerFrontServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ramilanigmatullina on 22.05.16.
 */
public class DrawerTest {
    private static DrawerFrontServiceImpl drawerFrontService;
    private static DrawerFront drawerFront;
    private static DrawerFront defaultdrawerFront;
    private static List<DrawerFront> list;

    @BeforeClass
    public static void before() {

        drawerFront = new DrawerFront();
        drawerFront.setId(100);
        drawerFront.setArticleNumber(12345);
        drawerFront.setName("name");

        defaultdrawerFront = new DrawerFront();

        list = new ArrayList<>();
        list.add(drawerFront);

        drawerFrontService = new DrawerFrontServiceImpl();
        DrawerFrontRepository drawerFrontRepository= mock(DrawerFrontRepository.class);

        when(drawerFrontRepository.findAll()).thenReturn(list);
        when(drawerFrontRepository.findOne(drawerFront.getId())).thenReturn(drawerFront);

    }

    @Test
    public void methodGetAllShouldReturnList() {
        Assert.assertEquals(list, drawerFrontService.getAll());
    }

    @Test
    public void methodGetByIdShouldOneBaseCabinet() {
        Assert.assertEquals(drawerFront, drawerFrontService.getById(drawerFront.getId()));
    }

    @Test
    public void defaultBaseCabinetShouldHaveNullId() {
        Assert.assertEquals(null, defaultdrawerFront.getId());
    }

    @Test
    public void defaultBaseCabinetShouldHaveNullArticleNumber() {
        Assert.assertEquals(null, defaultdrawerFront.getArticleNumber());
    }

    @Test
    public void defaultBaseCabinetShouldHaveNullName() {
        Assert.assertEquals(null, defaultdrawerFront.getName());
    }

    @Test
    public void baseCabinetShouldHaveName() {
        Assert.assertEquals("name", drawerFront.getName());
    }
}

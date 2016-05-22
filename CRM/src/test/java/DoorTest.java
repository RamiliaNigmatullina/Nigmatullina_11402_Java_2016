import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.kpfu.itis.nigmatullina.entity.Door;
import ru.kpfu.itis.nigmatullina.repository.DoorRepository;
import ru.kpfu.itis.nigmatullina.service.Impl.DoorServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ramilanigmatullina on 22.05.16.
 */
public class DoorTest {
    private static DoorServiceImpl doorService;
    private static Door door;
    private static Door defaultDoor;
    private static List<Door> list;

    @BeforeClass
    public static void before() {

        door = new Door();
        door.setId(100);
        door.setArticleNumber(12345);
        door.setName("name");

        defaultDoor = new Door();

        list = new ArrayList<>();
        list.add(door);

        doorService = new DoorServiceImpl();
        DoorRepository doorRepository= mock(DoorRepository.class);

        when(doorRepository.findAll()).thenReturn(list);
        when(doorRepository.findOne(door.getId())).thenReturn(door);

    }

    @Test
    public void methodGetAllShouldReturnList() {
        Assert.assertEquals(list, doorService.getAll());
    }

    @Test
    public void methodGetByIdShouldOneBaseCabinet() {
        Assert.assertEquals(door, doorService.getById(door.getId()));
    }

    @Test
    public void defaultBaseCabinetShouldHaveNullId() {
        Assert.assertEquals(null, defaultDoor.getId());
    }

    @Test
    public void defaultBaseCabinetShouldHaveNullArticleNumber() {
        Assert.assertEquals(null, defaultDoor.getArticleNumber());
    }

    @Test
    public void defaultBaseCabinetShouldHaveNullName() {
        Assert.assertEquals(null, defaultDoor.getName());
    }

    @Test
    public void baseCabinetShouldHaveName() {
        Assert.assertEquals("name", door.getName());
    }
}

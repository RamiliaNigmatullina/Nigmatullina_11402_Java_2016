import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.kpfu.itis.nigmatullina.entity.BaseCabinet;
import ru.kpfu.itis.nigmatullina.repository.BaseCabinetRepository;
import ru.kpfu.itis.nigmatullina.service.Impl.BaseCabinetServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ramilanigmatullina on 22.05.16.
 */
public class BaseCabinetService {
    private static BaseCabinetServiceImpl baseCabinetService;
    private static BaseCabinet baseCabinet;
    private static BaseCabinet defaultbaseCabinet;
    private static List<BaseCabinet> list;

    @BeforeClass
    public static void before() {

        baseCabinet = new BaseCabinet();
        baseCabinet.setId(100);
        baseCabinet.setArticleNumber(12345);
        baseCabinet.setName("name");

        defaultbaseCabinet = new BaseCabinet();

        list = new ArrayList<>();
        list.add(baseCabinet);

        baseCabinetService = new BaseCabinetServiceImpl();
        BaseCabinetRepository baseCabinetRepository= mock(BaseCabinetRepository.class);

        when(baseCabinetRepository.findAll()).thenReturn(list);
        when(baseCabinetRepository.findOne(baseCabinet.getId())).thenReturn(baseCabinet);

    }

    @Test
    public void methodGetAllShouldReturnList() {
        Assert.assertEquals(list, baseCabinetService.getAll());
    }

    @Test
    public void methodGetByIdShouldOneBaseCabinet() {
        Assert.assertEquals(baseCabinet, baseCabinetService.getById(baseCabinet.getId()));
    }

    @Test
    public void defaultBaseCabinetShouldHaveNullId() {
        Assert.assertEquals(null, defaultbaseCabinet.getId());
    }

    @Test
    public void defaultBaseCabinetShouldHaveNullArticleNumber() {
        Assert.assertEquals(null, defaultbaseCabinet.getArticleNumber());
    }

    @Test
    public void defaultBaseCabinetShouldHaveNullName() {
        Assert.assertEquals(null, defaultbaseCabinet.getName());
    }

    @Test
    public void baseCabinetShouldHaveName() {
        Assert.assertEquals("name", baseCabinet.getName());
    }
}

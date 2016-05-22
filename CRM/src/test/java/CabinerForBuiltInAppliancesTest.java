import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.kpfu.itis.nigmatullina.entity.CabinetForBuiltInAppliances;
import ru.kpfu.itis.nigmatullina.repository.CabinetForBuiltInAppliancesRepository;
import ru.kpfu.itis.nigmatullina.service.Impl.CabinetForBuiltInAppliancesServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by ramilanigmatullina on 22.05.16.
 */
public class CabinerForBuiltInAppliancesTest {
    private static CabinetForBuiltInAppliancesServiceImpl cabinetForBuiltInAppliancesService;
    private static CabinetForBuiltInAppliances cabinetForBuiltInAppliances;
    private static CabinetForBuiltInAppliances defaultCabinetForBuiltInAppliances;
    private static List<CabinetForBuiltInAppliances> list;

    @BeforeClass
    public static void before() {

        cabinetForBuiltInAppliances = new CabinetForBuiltInAppliances();
        cabinetForBuiltInAppliances.setId(100);
        cabinetForBuiltInAppliances.setArticleNumber(12345);
        cabinetForBuiltInAppliances.setName("name");

        defaultCabinetForBuiltInAppliances = new CabinetForBuiltInAppliances();

        list = new ArrayList<>();
        list.add(cabinetForBuiltInAppliances);

        cabinetForBuiltInAppliancesService = new CabinetForBuiltInAppliancesServiceImpl();
        CabinetForBuiltInAppliancesRepository cabinetForBuiltInAppliancesRepository= mock(CabinetForBuiltInAppliancesRepository.class);

        when(cabinetForBuiltInAppliancesRepository.findAll()).thenReturn(list);
        when(cabinetForBuiltInAppliancesRepository.findOne(cabinetForBuiltInAppliances.getId())).thenReturn(cabinetForBuiltInAppliances);

    }

    @Test
    public void methodGetAllShouldReturnList() {
        Assert.assertEquals(list, cabinetForBuiltInAppliancesService.getAll());
    }

    @Test
    public void methodGetByIdShouldOneBaseCabinet() {
        Assert.assertEquals(cabinetForBuiltInAppliances, cabinetForBuiltInAppliancesService.getById(cabinetForBuiltInAppliances.getId()));
    }

    @Test
    public void defaultBaseCabinetShouldHaveNullId() {
        Assert.assertEquals(null, defaultCabinetForBuiltInAppliances.getId());
    }

    @Test
    public void defaultBaseCabinetShouldHaveNullArticleNumber() {
        Assert.assertEquals(null, defaultCabinetForBuiltInAppliances.getArticleNumber());
    }

    @Test
    public void defaultBaseCabinetShouldHaveNullName() {
        Assert.assertEquals(null, defaultCabinetForBuiltInAppliances.getName());
    }

    @Test
    public void baseCabinetShouldHaveName() {
        Assert.assertEquals("name", cabinetForBuiltInAppliances.getName());
    }
}

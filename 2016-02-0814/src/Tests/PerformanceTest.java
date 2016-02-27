package Tests;

import Classes.Performance;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Ramilia Nigmatullina
 * 11-402
 * Task004
 */

public class PerformanceTest {

    @Test
    public void defaultActorShouldHaveNullName() {
        Performance performance = new Performance();
        Assert.assertEquals(null, performance.getName());
    }

    @Test
    public void constructorShouldSaveName() {
        Performance performance = new Performance(
                "Золотой слон", null, "Александр Славутский, оставляя и где-то даже нарочито утрируя комедийный ..");
        Assert.assertEquals("Золотой слон", performance.getName());
    }

    @Test
    public void methodToStringShouldReturnRightString() {
        Performance performance = new Performance(
                "Золотой слон", null, "Александр Славутский, оставляя и где-то даже нарочито утрируя комедийный ..");
        Assert.assertEquals("It is a performance \"" + performance.getName() + "\".", performance.toString());
    }
}

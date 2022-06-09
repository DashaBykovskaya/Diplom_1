import org.junit.Test;
import praktikum.Bun;
import static org.junit.Assert.assertEquals;

public class BunTest {

    private static final double DELTA = 1e-15;
    Bun bun = new Bun("Флюоресцентная булка", 20.0F);

    @Test
    public void BunNameTest() {
        String actual = bun.getName();
        String expected = "Флюоресцентная булка";
        assertEquals(expected, actual);
    }

    @Test
    public void BunPriceTest() {
        float actual = bun.getPrice();
        float expected = 20.0F;
        assertEquals(expected, actual, DELTA);

    }
}

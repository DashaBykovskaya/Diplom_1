import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private final IngredientType actual;
    private final String expected;

    public IngredientTypeTest(String expected, IngredientType actual) {
        this.actual = actual;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0},{1}")
    public static Object[][] getIngredientType() {
        return new Object[][]{
                {"SAUCE", IngredientType.SAUCE},
                {"FILLING", IngredientType.FILLING}
        };
    }

    @Test
    public void getTestIngredientType(){
        Ingredient ingredient= new Ingredient(actual,"Test", 2.0F);
        assertEquals(expected, ingredient.getType().name());

    }
}

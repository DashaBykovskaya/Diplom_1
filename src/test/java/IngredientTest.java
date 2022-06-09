import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTest {
    private static final double DELTA = 1e-15;
    Ingredient ingredient = new Ingredient(IngredientType.SAUCE,"spicy", 1.1F);

    @Test
    public void IngredientGetPriceTest(){
        float actual = ingredient.getPrice();
        float expected = 1.1F;
        assertEquals(expected, actual, DELTA);
    }

    @Test
    public void IngredientGetNameTest(){
        String actual = ingredient.getName();
        String expected = "spicy";
        assertEquals(expected, actual);
    }
}

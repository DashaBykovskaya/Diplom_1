import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    Burger burger = new Burger();
    private static final double DELTA = 1e-15;

    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;

    @Test
    public void setBunTest() {
        burger.setBuns(bun);
        assertEquals(bun, burger.bun);
    }

    @Test
    public void addIngredientTest() {
        burger.addIngredient(ingredient);
        assertEquals(ingredient, burger.ingredients.get(0));
    }

    @Test
    public void removeIngredientTest() {
        burger.ingredients.add(0, ingredient);
        burger.removeIngredient(0);
        assertEquals(true, burger.ingredients.isEmpty());
    }

    @Test
    public void moveIngredientTest() {
        burger.addIngredient(ingredient);
        Ingredient firstIngredient = burger.ingredients.get(0);
        Ingredient secondIngredient = Mockito.mock(Ingredient.class);
        burger.addIngredient(secondIngredient);
        burger.moveIngredient(0, 1);
        assertEquals(firstIngredient, burger.ingredients.get(1));
    }

    @Test
    public void getPrice() {
        float bunPrice = 12.0f;
        float ingredientPrice = 12.0f;
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.when(bun.getPrice()).thenReturn(bunPrice);
        Mockito.when(ingredient.getPrice()).thenReturn(ingredientPrice);
        Assert.assertEquals("Проверьте цену!", (bunPrice*2)+ingredientPrice, burger.getPrice(), DELTA);
    }
}

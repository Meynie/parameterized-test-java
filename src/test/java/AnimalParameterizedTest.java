import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    private final Animal animal = new Animal();

    private final String typeAnimal;
    private final List<String> expectedResultList ;

    public AnimalParameterizedTest(String typeAnimal, List<String> expectedResultList ){
        this.typeAnimal = typeAnimal;
        this.expectedResultList  = expectedResultList ;
    }

    @Parameterized.Parameters
    public static Object[][] getDietData() {
        return new Object[][] {
                { "Травоядное", List.of("Трава", "Различные растения")},
                { "Хищник", List.of("Животные", "Птицы", "Рыба")},
                { "Рыба", List.of()},
        };
    }

    @Test
    public void testGetFood() throws Exception {
        try {
            assertEquals(expectedResultList, animal.getFood(typeAnimal));
        } catch (Exception thrown) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", thrown.getMessage());
        }
    }

    @Test
    public void getFamilyTest() {
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualResult = animal.getFamily();
        assertEquals(expectedResult, actualResult);
    }
}
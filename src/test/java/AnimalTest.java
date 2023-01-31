import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    private final Animal animal = new Animal();

    @Test
    public void getFamilyTest() {
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualResult = animal.getFamily();
        assertEquals(expectedResult, actualResult);
    }
}

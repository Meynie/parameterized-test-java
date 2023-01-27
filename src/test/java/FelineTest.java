import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    private final Feline feline = new Feline();

    @Test
    public void eatMeatTest() throws Exception {
        List<String> actual = feline.eatMeat();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithoutArgumentsTest() {
        int actualKittens = feline.getKittens();
        int expectedKittens = 1;
        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void getKittensWithArgumentsTest() {
        int expectedKittens = 8;
        int actualKittens = feline.getKittens(expectedKittens);
        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void testGetFamily() {
        String actualFamily = feline.getFamily();
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily, actualFamily);
    }
}

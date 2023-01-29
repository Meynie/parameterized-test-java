import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {

    private final int numberOffspring;
    private final int expectedOffspring;

    public FelineParameterizedTest(int numberOffspring, int expectedOffspring){
        this.numberOffspring = numberOffspring;
        this.expectedOffspring = expectedOffspring;
    }

    @Parameterized.Parameters
    public static Object[][] getOffspringData() {
        return new Object[][] {
                {2, 2},
                {5, 5},
        };
    }

    @Test
    public void testTestGetKittens() {
        Feline feline = new Feline();
        assertEquals(expectedOffspring, feline.getKittens(numberOffspring));
    }
}

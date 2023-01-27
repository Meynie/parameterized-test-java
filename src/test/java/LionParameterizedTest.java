import com.example.Feline;
import com.example.Lion;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean expectedSex;

    public LionParameterizedTest(String sex, boolean expectedHasMane ){
        this.sex = sex;
        this.expectedSex = expectedHasMane ;
    }

    @Parameterized.Parameters
    public static Object[][] getGenderData() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false},
                { "Пол животного неизвестен", false},
        };
    }

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    Feline feline;


    @Test
    public void testDoesHaveMane() {
        try {
            Lion lion = new Lion(sex, feline);
            boolean actualHasMane = lion.doesHaveMane();
            assertEquals(expectedSex, actualHasMane);
        } catch (Exception thrown) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
        }
    }
}

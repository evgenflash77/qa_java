import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;



@RunWith(Parameterized.class)

public class FelineParameterizedTest {

    private final int kittens;

    public FelineParameterizedTest(int kittens) {
        this.kittens = kittens;

    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[]{1}, new Object[]{5});
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();
        assertEquals(kittens, feline.getKittens(kittens));
    }
}





























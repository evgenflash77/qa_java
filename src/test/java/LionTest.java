import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import java.util.List;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;


   @RunWith(MockitoJUnitRunner.class)
   public class LionTest {

    @Mock
    Feline feline;



    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        when(feline.getKittens()).thenReturn(5);
        assertEquals(5, lion.getKittens());
    }

    @Test
    public void testgetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы","Рыба"),lion.getFood());
    }

    @Test
    public void testInvalidSex() {
        try {
            new Lion("Детёныш", feline);
            fail("Исключение должно было быть выброшено");
        } catch (Exception e) {
            // Проверяем, что исключение действительно поймано
            assertTrue(e.getMessage().contains("допустимые значения"));
        }
    }

}

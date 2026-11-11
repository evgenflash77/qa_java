import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;


       public class FelineTest {


          @Test
        public void testGetFamily() {
            Feline feline = new Feline();
            assertEquals("Кошачьи", feline.getFamily());
        }

        @Test
        public void testGetEatMeat() throws Exception {
            Feline feline = new Feline();
              assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
        }

        @Test
        public void testGetKittensNone(){
            Feline feline = new Feline();
            assertEquals(1, feline.getKittens());
        }



        @Test
        public void testgetFood()throws Exception{
            Feline feline = new Feline();
            assertEquals(List.of("Трава", "Различные растения"), feline.getFood("Травоядное"));
        }




    }

import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    Predator predator;
    @Test
    public void getFamilyFeline(){
        Feline feline = new Feline();
        String actualFamily = "Кошачьи";
        assertEquals( feline.getFamily(),actualFamily);
    }
    @Test
    public void eatMeatTest()throws Exception{
        Feline feline = new Feline();
        List<String> expectedMeat = List.of("Животные", "Птицы", "Рыба");
        List<String> actualMeat = feline.eatMeat();
        assertEquals(expectedMeat, actualMeat);
    }
    @Test
    public void getKittensTest(){
        Feline feline = new Feline();
        int actualKittens = 1;
        assertEquals(feline.getKittens(), actualKittens);
    }
}

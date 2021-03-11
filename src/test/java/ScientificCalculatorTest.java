import static org.junit.Assert.*;
import org.junit.Test;

public class ScientificCalculatorTest {
    ScientificCalculator calculator = new ScientificCalculator();

    @Test
    public void additionTest(){
        assertEquals("Adding two integer numbers for True Positive", 4, calculator.add(2, 2));
        assertEquals("Adding two double numbers for True Positive", 5, calculator.add(2, 3));
        assertEquals("Adding two double numbers for True Positive", 89, calculator.add(2, 87));
    }
    
    @Test
    public void additionTest2(){
        assertEquals("Adding two integer numbers for True Positive", 4, calculator.add(2, 2));
        assertEquals("Adding two double numbers for True Positive", 5, calculator.add(2, 3));
        assertEquals("Adding two double numbers for True Positive", 89, calculator.add(2, 87));
    }
}

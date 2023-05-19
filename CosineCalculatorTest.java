import org.junit.Test;
import static org.junit.Assert.*;

public class CosineCalculatorTest {
    
    @Test
    public void testCosineCalculator() {
        CosineCalculator calculator = new CosineCalculator();
        assertEquals(1.0, calculator.cos(0), 0.0001);
        assertEquals(0.7071, calculator.cos(45), 0.0001);
        assertEquals(0.0, calculator.cos(90), 0.0001);
        assertEquals(-1.0, calculator.cos(180), 0.0001);
        assertEquals(0.0, calculator.cos(270), 0.0001);
        assertEquals(1.0, calculator.cos(360), 0.0001);
    }
}

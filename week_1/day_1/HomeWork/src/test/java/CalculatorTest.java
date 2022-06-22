import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void hasAdd(){
        assertEquals(6, calculator.add(1,5));
    }

    @Test
    public void hasSubtract(){
        assertEquals(4, calculator.subtract(5,1));
    }

    @Test
    public void hasMultiply(){
        assertEquals(10, calculator.multiply(5,2));
    }

    @Test
    public void hasDivide(){
        assertEquals(3, calculator.devide(6,2),0.0);
    }
}

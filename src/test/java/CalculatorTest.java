import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(2,3));
    }

    @Test
    public void canSubtract(){
        assertEquals(8, calculator.subtract(10, 2));
    }

    @Test
    public void canMultiply(){
        assertEquals(42, calculator.multiply(6,7));
    }

    @Test
    public void canDivide(){
        assertEquals(6.0, calculator.divide(36.0,6.0),0.01);
    }



}

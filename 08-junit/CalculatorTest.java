package put.io.testing.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
    @BeforeEach         //BeforeALl nie działa, ponieważ jest on dla metod statycznych
    public void setUp(){
        calculator = new Calculator();
    }
    @Test
    public void testadd() {
        //Calculator c = new Calculator();
        assertEquals(calculator.add(2,3),5);


        assertEquals(calculator.add(2,4),6);


    }
    @Test
    public void testmultiply() {
       // Calculator c = new Calculator();
        assertEquals(calculator.multiply(2,3),6);


        assertEquals(calculator.multiply(2,4),8);


    }
    @Test
    public void testaddPositiveNumbers() {
       // Calculator c = new Calculator();
       //
        //assertThrows(IllegalArgumentException.class,() ->{ c.addPositiveNumbers(-2,3);});

        assertThrows(IllegalArgumentException.class, () -> {
            calculator.addPositiveNumbers(-2,3);
        });


    }


}
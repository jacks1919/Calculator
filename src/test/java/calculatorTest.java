//  Jack Sheridan
//  G00326495
//  Test for calculator
//  18-02-21

import ie.gmit.calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class calculatorTest {

    @Test
    void testAdd() {
        calculator calculator = new calculator();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
    }
}

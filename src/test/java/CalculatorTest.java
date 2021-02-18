//  Jack Sheridan
//  G00326495
//  Test for calculator
//  18-02-21

import ie.gmit.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        double result = calculator.subtract(10, 5);
        assertEquals(5, result, 0);
    }

    @Test
    void testdivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(10, 5);
        assertEquals(2, result, 0);
    }

    @Test
    void testmultiply() {
        Calculator calculator = new Calculator();
        double result = calculator.multiply(10, 5);
        assertEquals(50, result, 0);
    }
}

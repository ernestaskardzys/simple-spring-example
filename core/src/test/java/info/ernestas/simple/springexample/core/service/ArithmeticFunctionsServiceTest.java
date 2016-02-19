package info.ernestas.simple.springexample.core.service;

import info.ernestas.simple.springexample.core.service.impl.ArithmeticFunctionsServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticFunctionsServiceTest {

    private ArithmeticFunctionsService arithmeticFunctionsService;

    @Before
    public void setUp() {
        arithmeticFunctionsService = new ArithmeticFunctionsServiceImpl();
    }

    @Test
    public void testAddTwoNumbers() {
        double a = 10.78;
        double b = 2.1;

        double result = arithmeticFunctionsService.add(a, b);

        assertEquals(12.88, result, 0.1);
    }

    @Test
    public void testSubtractTwoNumbers() {
        double a = 5.87;
        double b = 1.67;

        double result = arithmeticFunctionsService.subtract(a, b);

        assertEquals(4.2, result, 0.1);
    }

    @Test
    public void testMultiplyTwoNumbers() {
        double a = 15.35;
        double b = 98.21;

        double result = arithmeticFunctionsService.multiply(a, b);

        assertEquals(1507.53, result, 0.1);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideTwoNumbers_divisionByZero() {
        double a = 87.41;
        double b = 0;

        arithmeticFunctionsService.divide(a, b);
    }

    @Test
    public void testDivideTwoNumbers() {
        double a = 21.54;
        double b = 3.25;

        double result = arithmeticFunctionsService.divide(a, b);
        assertEquals(6.62, result, 0.1);
    }

}
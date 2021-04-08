import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArithmeticCalculatorAppTest extends Assertions{

    private static ArithmeticCalculatorApp calculator;


    @BeforeAll
    static void before() {
        calculator = new ArithmeticCalculatorApp();
    }


    @Test
    void calculateSum1() {
        double result = calculator.calculate(4,2, '+');

        assertEquals(6, result);

    }

    @Test
    void calculateSum2() {
        double result = calculator.calculate(4.0, 2, '+');

        assertEquals(6.0, result);
    }

    @Test
    void calculateMultiplication() {

        double result = calculator.calculate(8.0, 3, '*');

        assertEquals(24.0, result);
    }

    @Test
    void calculateDivision() {
        double result = calculator.calculate(42, 7, '/' );

        assertEquals(6, result);
    }

    @Test
    void calculateSubtraction1() {
        double result = calculator.calculate(10, 6, '-');

        assertEquals(4, result);
    }

    @Test
    void calculateSubtraction2() {
        double result = calculator.calculate(-10, 6, '-');

        assertEquals(-16, result);
    }

}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    void dif() {
        Calculator calculator = new Calculator();
        int result = calculator.dif(8, 3);
        assertEquals(5, result);
    }

    @Test
    void div() {
        Calculator calculator = new Calculator();
        int result = calculator.div(10, 2);
        assertEquals(5, result);
    }

    @Test
    void divByZero() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.div(5, 0));
    }

    @Test
    void times() {
        Calculator calculator = new Calculator();
        int result = calculator.times(6, 7);
        assertEquals(42, result);
    }

    @Test
    void solver() {
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.solver(3, 4, "add"));
        assertEquals(5, calculator.solver(8, 3, "dif"));
        assertEquals(5, calculator.solver(10, 2, "div"));
        assertEquals(42, calculator.solver(6, 7, "times"));

        assertThrows(IllegalArgumentException.class, () -> calculator.solver(1, 2, "неподдерживаемый"));
    }
}
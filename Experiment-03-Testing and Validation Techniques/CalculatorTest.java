import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator c = new Calculator();

    @Test void testAddition() { assertEquals(15, c.add(10, 5)); }
    @Test void testSubtraction() { assertEquals(5, c.subtract(10, 5)); }
    @Test void testMultiplication() { assertEquals(50, c.multiply(10, 5)); }
    @Test void testDivision() { assertEquals(2, c.divide(10, 5)); }
    @Test void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> c.divide(10, 0));
    }
}

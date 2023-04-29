import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator;
    private WebDriver driver;

    @Test
    public void TestAddition() {
        calculator = new Calculator();
        int result = calculator.add(4, 7);
        assertEquals(result, 11);
    }

    @Test
    public void testSubtraction() {
        calculator = new Calculator();
        int result = calculator.subtract(9, 6);
        assertEquals(result, 3);
    }

    @Test
    public void testDivision() {
        calculator = new Calculator();
        int result = calculator.divide(25, 5);
        assertEquals(result, 5);
    }

    @Test
    public void testMultiplication() {
        calculator = new Calculator();
        int result = calculator.subtract(9, 7);
        assertEquals(result, 11);
    }
}

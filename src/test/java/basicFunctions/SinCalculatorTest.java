package basicFunctions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SinCalculatorTest {
    private final static double TEST_VALUE_PRECISION = 1e-5;
    private final static SinCalculator sinCalculator = new SinCalculator();

    @BeforeAll
    public static void init() {
        sinCalculator.setPrecision(TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometricFunctions/sinValues.csv")
    public void testValue(double x, double expected) {
        sinCalculator.setX(x);
        sinCalculator.compute();
        Assertions.assertEquals(expected, sinCalculator.getResult(), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometricFunctions/sinValues.csv")
    public void testValueWithPrecision(double x, double expected) {
        sinCalculator.setX(x);
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinCalculator.setPrecision(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> sinCalculator.setPrecision(0));
        sinCalculator.setPrecision(1e-10);
        sinCalculator.compute();
        Assertions.assertEquals(expected, sinCalculator.getResult(), 1e-10);
    }
}

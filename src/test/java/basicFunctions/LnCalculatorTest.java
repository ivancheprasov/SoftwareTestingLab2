package basicFunctions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class LnCalculatorTest {
    private final static double TEST_VALUE_PRECISION = 1e-5;
    private final static LnCalculator lnCalculator = new LnCalculator();

    @BeforeAll
    public static void init() {
        lnCalculator.setPrecision(TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/logarithmicFunctions/lnValues.csv")
    public void testValue(double x, double expected) {
        lnCalculator.setX(x);
        lnCalculator.compute();
        Assertions.assertEquals(expected, lnCalculator.getResult(), TEST_VALUE_PRECISION);
    }

    @Test
    public void testImproperArgument() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> lnCalculator.setX(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> lnCalculator.setX(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> lnCalculator.setX(Double.NEGATIVE_INFINITY));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/logarithmicFunctions/lnValues.csv")
    public void testValueWithPrecision(double x, double expected) {
        lnCalculator.setX(x);
        Assertions.assertThrows(IllegalArgumentException.class, () -> lnCalculator.setPrecision(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> lnCalculator.setPrecision(0));
        lnCalculator.setPrecision(1e-10);
        lnCalculator.compute();
        Assertions.assertEquals(expected, lnCalculator.getResult(), 1e-10);
    }
}

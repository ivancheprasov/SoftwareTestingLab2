package system;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class FunctionSystemTest {
    private final static double TEST_VALUE_PRECISION = 1e-5;
    private static final FunctionSystem fs = new FunctionSystem();

    @BeforeAll
    public static void init(){
        fs.setPrecision(TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system/systemValues.csv")
    public void testValue(double x, double expected) {
        fs.setX(x);
        fs.compute();
        Assertions.assertEquals(expected, fs.getResult(), TEST_VALUE_PRECISION);
    }

    @Test
    public void testSolveIteratively() {
        fs.solveIteratively(-2 * Math.PI,  Math.PI, 0.01);
        fs.solveIteratively(-2 * Math.PI,  Math.PI, 1);
        fs.solveIteratively(-4 * Math.PI,  -2 * Math.PI, 0.01);
        fs.solveIteratively(0.01,  10, 0.01);
        fs.solveIteratively(-50,  50, 100);
        fs.solveIteratively(-10,  10, 100);
    }


    @Test
    public void testImproperStep() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> fs.solveIteratively(0, 1, 0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> fs.solveIteratively(0, 1, -1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> fs.solveIteratively(0, 1, Double.NEGATIVE_INFINITY));
    }

    @Test
    public void testImproperSegment() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> fs.solveIteratively(1, 0, 1e-3));
        Assertions.assertThrows(IllegalArgumentException.class, () -> fs.solveIteratively(0, 0, 1e-3));
        Assertions.assertThrows(IllegalArgumentException.class, () -> fs.solveIteratively(1e-12, 0, 1e-3));
        Assertions.assertThrows(IllegalArgumentException.class, () -> fs.solveIteratively(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, 1e-3));
    }

    @Test
    public void testImproperPrecision() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> fs.setPrecision(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> fs.setPrecision(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> fs.setPrecision(Double.NEGATIVE_INFINITY));
    }
}

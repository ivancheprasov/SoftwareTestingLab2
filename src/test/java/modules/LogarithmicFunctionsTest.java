package modules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.mockito.Mockito;

public class LogarithmicFunctionsTest {
    private final static double TEST_VALUE_PRECISION = 1e-5;
    private final static LogarithmicFunctions lgF = new LogarithmicFunctions();
    private final static LogarithmicFunctions mock = Mockito.spy(LogarithmicFunctions.class);
    @BeforeAll
    public static void init() {
        lgF.setPrecision(TEST_VALUE_PRECISION);
        Mockito.when(mock.ln(0.001)).thenReturn(-6.90775527898);
        Mockito.when(mock.ln(1)).thenReturn(0d);
        Mockito.when(mock.ln(1.5)).thenReturn(0.4054651081);
        Mockito.when(mock.ln(2)).thenReturn(0.693147);
        Mockito.when(mock.ln(2.718281828459045)).thenReturn(1d);
        Mockito.when(mock.ln(3)).thenReturn(1.098612);
        Mockito.when(mock.ln(5)).thenReturn(1.609438);
        Mockito.when(mock.ln(10)).thenReturn(2.302585);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/logarithmicFunctions/lnValues.csv")
    public void testLnIntegration(double x, double expected) {
        Assertions.assertEquals(expected, lgF.ln(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/logarithmicFunctions/log2Values.csv")
    public void testLog2(double x, double expected) {
        Assertions.assertEquals(expected, mock.log2(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/logarithmicFunctions/log2Values.csv")
    public void testLog2Integration(double x, double expected) {
        Assertions.assertEquals(expected, lgF.log2(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/logarithmicFunctions/log3Values.csv")
    public void testLog3(double x, double expected) {
        Assertions.assertEquals(expected, mock.log3(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/logarithmicFunctions/log3Values.csv")
    public void testLog3Integration(double x, double expected) {
        Assertions.assertEquals(expected, lgF.log3(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/logarithmicFunctions/log5Values.csv")
    public void testLog5(double x, double expected) {
        Assertions.assertEquals(expected, mock.log5(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/logarithmicFunctions/log5Values.csv")
    public void testLog5Integration(double x, double expected) {
        Assertions.assertEquals(expected, lgF.log5(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/logarithmicFunctions/log10Values.csv")
    public void testLog10(double x, double expected) {
        Assertions.assertEquals(expected, mock.log10(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/logarithmicFunctions/log10Values.csv")
    public void testLog10Integration(double x, double expected) {
        Assertions.assertEquals(expected, lgF.log10(x), TEST_VALUE_PRECISION);
    }

    @Test
    public void testImproperPrecision() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> lgF.setPrecision(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> lgF.setPrecision(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> lgF.setPrecision(Double.NEGATIVE_INFINITY));
    }
}

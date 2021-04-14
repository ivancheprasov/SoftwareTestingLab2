package modules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.mockito.AdditionalMatchers.eq;
import org.mockito.Mockito;

public class TrigonometricFunctionsTest {
    private final static double TEST_VALUE_PRECISION = 1e-5;
    private static final TrigonometricFunctions trF = new TrigonometricFunctions();
    private static final TrigonometricFunctions mock = Mockito.spy(TrigonometricFunctions.class);

    @BeforeAll
    public static void init() {
        trF.setPrecision(TEST_VALUE_PRECISION);
        Mockito.when(mock.sin(eq(-2 * Math.PI, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mock.sin(eq(-Math.PI, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mock.sin(0)).thenReturn(0.0);
        Mockito.when(mock.sin(eq(Math.PI / 2, TEST_VALUE_PRECISION))).thenReturn(1.0);
        Mockito.when(mock.sin(eq(Math.PI, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mock.sin(eq(4.71238898038, TEST_VALUE_PRECISION))).thenReturn(-1.0);
        Mockito.when(mock.sin(eq(2 * Math.PI, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mock.sin(eq(5.75958653158, TEST_VALUE_PRECISION))).thenReturn(-0.5);
        Mockito.when(mock.sin(eq(2.61799387799, TEST_VALUE_PRECISION))).thenReturn(0.5);
        Mockito.when(mock.sin(eq(0.78539816339, TEST_VALUE_PRECISION))).thenReturn(0.707);
        Mockito.when(mock.sin(eq(2.35619449019, TEST_VALUE_PRECISION))).thenReturn(0.707);
        Mockito.when(mock.sin(eq(1.0471975512, TEST_VALUE_PRECISION))).thenReturn(0.866025);
        Mockito.when(mock.cos(eq(-2 * Math.PI, TEST_VALUE_PRECISION))).thenReturn(1.0);
        Mockito.when(mock.cos(eq(-Math.PI, TEST_VALUE_PRECISION))).thenReturn(1.0);
        Mockito.when(mock.cos(0)).thenReturn(1.0);
        Mockito.when(mock.cos(eq(Math.PI / 2, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mock.cos(eq(Math.PI, TEST_VALUE_PRECISION))).thenReturn(1.0);
        Mockito.when(mock.cos(eq(4.71238898038, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mock.cos(eq(2 * Math.PI, TEST_VALUE_PRECISION))).thenReturn(1.0);
        Mockito.when(mock.cos(eq(5.75958653158, TEST_VALUE_PRECISION))).thenReturn(0.86602540378);
        Mockito.when(mock.cos(eq(2.61799387799, TEST_VALUE_PRECISION))).thenReturn(-0.86602540378);
        Mockito.when(mock.cos(eq(0.52359877559, TEST_VALUE_PRECISION))).thenReturn(0.86602540378);
        Mockito.when(mock.cos(eq(0.78539816339, TEST_VALUE_PRECISION))).thenReturn(0.707);
        Mockito.when(mock.cos(eq(2.35619449019, TEST_VALUE_PRECISION))).thenReturn(-0.707);
        Mockito.when(mock.cos(eq(1.0471975512, TEST_VALUE_PRECISION))).thenReturn(0.5);
        Mockito.when(mock.cos(eq(2.09439510239, TEST_VALUE_PRECISION))).thenReturn(-0.5);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometricFunctions/sinValues.csv")
    public void testSinIntegration(double x, double expected) {
        Assertions.assertEquals(expected, trF.sin(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometricFunctions/cosValues.csv")
    public void testCos(double x, double expected) {
        TrigonometricFunctions mockCosTest = Mockito.spy(TrigonometricFunctions.class);
        Mockito.when(mockCosTest.sin(eq(-2 * Math.PI, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mockCosTest.sin(eq(-Math.PI, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mockCosTest.sin(0)).thenReturn(0.0);
        Mockito.when(mockCosTest.sin(eq(Math.PI / 2, TEST_VALUE_PRECISION))).thenReturn(1.0);
        Mockito.when(mockCosTest.sin(eq(Math.PI, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mockCosTest.sin(eq(4.71238898038, TEST_VALUE_PRECISION))).thenReturn(-1.0);
        Mockito.when(mockCosTest.sin(eq(2 * Math.PI, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mockCosTest.sin(eq(5.75958653158, TEST_VALUE_PRECISION))).thenReturn(-0.5);
        Mockito.when(mockCosTest.sin(eq(2.61799387799, TEST_VALUE_PRECISION))).thenReturn(0.5);
        Mockito.when(mockCosTest.sin(eq(0.78539816339, TEST_VALUE_PRECISION))).thenReturn(0.707);
        Mockito.when(mockCosTest.sin(eq(2.35619449019, TEST_VALUE_PRECISION))).thenReturn(0.707);
        Mockito.when(mockCosTest.sin(eq(1.0471975512, TEST_VALUE_PRECISION))).thenReturn(0.866025);
        Assertions.assertEquals(expected, mockCosTest.cos(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometricFunctions/cosValues.csv")
    public void testCosIntegration(double x, double expected) {
        Assertions.assertEquals(expected, trF.cos(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometricFunctions/tanValues.csv")
    public void testTan(double x, double expected) {
        Assertions.assertEquals(expected, mock.tan(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometricFunctions/tanValues.csv")
    public void testIntegrationTan(double x, double expected) {
        Assertions.assertEquals(expected, trF.tan(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometricFunctions/cotValues.csv")
    public void testCot(double x, double expected) {
        Assertions.assertEquals(expected, mock.cot(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometricFunctions/cotValues.csv")
    public void testIntegrationCot(double x, double expected) {
        Assertions.assertEquals(expected, trF.cot(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometricFunctions/secValues.csv")
    public void testSec(double x, double expected) {
        Assertions.assertEquals(expected, mock.sec(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometricFunctions/secValues.csv")
    public void testIntegrationSec(double x, double expected) {
        Assertions.assertEquals(expected, trF.sec(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometricFunctions/cscValues.csv")
    public void testCsc(double x, double expected) {
        Assertions.assertEquals(expected, mock.csc(x), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/trigonometricFunctions/cscValues.csv")
    public void testIntegrationCsc(double x, double expected) {
        Assertions.assertEquals(expected, trF.csc(x), TEST_VALUE_PRECISION);
    }

    @Test
    public void testAsymptote() {
        Assertions.assertEquals(trF.tan(Math.PI/2), Double.POSITIVE_INFINITY);
        Assertions.assertEquals(trF.tan(- Math.PI/2), Double.NEGATIVE_INFINITY);
        Assertions.assertEquals(trF.cot(0), Double.POSITIVE_INFINITY);
        Assertions.assertEquals(trF.cot(Math.PI), Double.NEGATIVE_INFINITY);
        Assertions.assertEquals(trF.sec(Math.PI/2), Double.POSITIVE_INFINITY);
        Assertions.assertEquals(trF.sec(- Math.PI/2), Double.POSITIVE_INFINITY);
        Assertions.assertEquals(trF.csc(0), Double.POSITIVE_INFINITY);
        Assertions.assertEquals(trF.csc(Math.PI), Double.POSITIVE_INFINITY);
    }

    @Test
    public void testImproperPrecision() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> trF.setPrecision(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> trF.setPrecision(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> trF.setPrecision(Double.NEGATIVE_INFINITY));
    }
}

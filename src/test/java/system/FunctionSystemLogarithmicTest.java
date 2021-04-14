package system;

import modules.LogarithmicFunctions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.mockito.AdditionalMatchers;
import org.mockito.Mockito;

import static org.mockito.AdditionalMatchers.eq;

public class FunctionSystemLogarithmicTest {
    private final static double TEST_VALUE_PRECISION = 1e-5;
    private static final LogarithmicFunctions mock = Mockito.mock(LogarithmicFunctions.class);
    private static final FunctionSystem fs = new FunctionSystem();

    @BeforeAll
    public static void init(){
        Mockito.doCallRealMethod().when(mock).setPrecision(TEST_VALUE_PRECISION);
        fs.setLogarithmicFunctions(mock);
        fs.setPrecision(TEST_VALUE_PRECISION);
        Mockito.when(mock.ln(eq(0.0429688, TEST_VALUE_PRECISION))).thenReturn(-3.14728100804550531918);
        Mockito.when(mock.ln(eq(0.4, TEST_VALUE_PRECISION))).thenReturn(-0.9162906536882091);
        Mockito.when(mock.ln(eq(0.5, TEST_VALUE_PRECISION))).thenReturn(-0.6931470737597851);
        Mockito.when(mock.ln(eq(0.8, TEST_VALUE_PRECISION))).thenReturn(-0.22314349099900074);
        Mockito.when(mock.ln(eq(1.0, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mock.ln(eq(1.5, TEST_VALUE_PRECISION))).thenReturn(0.40546499047619056);
        Mockito.when(mock.ln(eq(1.8466, TEST_VALUE_PRECISION))).thenReturn(0.6133460866234822);
        Mockito.when(mock.ln(eq(2.0, TEST_VALUE_PRECISION))).thenReturn(0.6931470737597851);
        Mockito.when(mock.ln(eq(10.0, TEST_VALUE_PRECISION))).thenReturn(2.302585012353853);
        Mockito.when(mock.ln(eq(100.0, TEST_VALUE_PRECISION))).thenReturn(4.605170117122673);
        Mockito.when(mock.log2(eq(0.0429688, TEST_VALUE_PRECISION))).thenReturn(-4.540566702591268267107);
        Mockito.when(mock.log2(eq(0.4, TEST_VALUE_PRECISION))).thenReturn(-1.3219281857716618);
        Mockito.when(mock.log2(eq(0.5, TEST_VALUE_PRECISION))).thenReturn(-1.0);
        Mockito.when(mock.log2(eq(0.8, TEST_VALUE_PRECISION))).thenReturn(-0.3219280574736043);
        Mockito.when(mock.log2(eq(1.0, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mock.log2(eq(1.5, TEST_VALUE_PRECISION))).thenReturn(0.5849624211451367);
        Mockito.when(mock.log2(eq(1.8466, TEST_VALUE_PRECISION))).thenReturn(0.8848714938614045);
        Mockito.when(mock.log2(eq(2.0, TEST_VALUE_PRECISION))).thenReturn(1.0);
        Mockito.when(mock.log2(eq(10.0, TEST_VALUE_PRECISION))).thenReturn(3.3219284903911026);
        Mockito.when(mock.log2(eq(100.0, TEST_VALUE_PRECISION))).thenReturn(6.643857114108839);
        Mockito.when(mock.log3(eq(0.0429688, TEST_VALUE_PRECISION))).thenReturn(-2.864778630740673958565);
        Mockito.when(mock.log3(eq(0.4, TEST_VALUE_PRECISION))).thenReturn(-0.8340437406812384);
        Mockito.when(mock.log3(eq(0.5, TEST_VALUE_PRECISION))).thenReturn(-0.6309296901740348);
        Mockito.when(mock.log3(eq(0.8, TEST_VALUE_PRECISION))).thenReturn(-0.20311396956015002);
        Mockito.when(mock.log3(eq(1.0, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mock.log3(eq(1.5, TEST_VALUE_PRECISION))).thenReturn(0.36907015913655433);
        Mockito.when(mock.log3(eq(1.8466, TEST_VALUE_PRECISION))).thenReturn(0.5582916974658112);
        Mockito.when(mock.log3(eq(2.0, TEST_VALUE_PRECISION))).thenReturn(0.6309296901740348);
        Mockito.when(mock.log3(eq(10.0, TEST_VALUE_PRECISION))).thenReturn(2.0959033132227574);
        Mockito.when(mock.log3(eq(100.0, TEST_VALUE_PRECISION))).thenReturn(4.191806710565246);
        Mockito.when(mock.log5(eq(0.0429688, TEST_VALUE_PRECISION))).thenReturn(-1.955515639174663140206);
        Mockito.when(mock.log5(eq(0.4, TEST_VALUE_PRECISION))).thenReturn(-0.5693234173336356);
        Mockito.when(mock.log5(eq(0.5, TEST_VALUE_PRECISION))).thenReturn(-0.43067650985995043);
        Mockito.when(mock.log5(eq(0.8, TEST_VALUE_PRECISION))).thenReturn(-0.13864685221872544);
        Mockito.when(mock.log5(eq(1.0, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mock.log5(eq(1.5, TEST_VALUE_PRECISION))).thenReturn(0.25192957393801396);
        Mockito.when(mock.log5(eq(1.8466, TEST_VALUE_PRECISION))).thenReturn(0.38109336665079024);
        Mockito.when(mock.log5(eq(2.0, TEST_VALUE_PRECISION))).thenReturn(0.43067650985995043);
        Mockito.when(mock.log5(eq(10.0, TEST_VALUE_PRECISION))).thenReturn(1.430676568245974);
        Mockito.when(mock.log5(eq(100.0, TEST_VALUE_PRECISION))).thenReturn(2.8613531939125973);
        Mockito.when(mock.log10(eq(0.0429688, TEST_VALUE_PRECISION))).thenReturn(-1.366846774793066879625);
        Mockito.when(mock.log10(eq(0.4, TEST_VALUE_PRECISION))).thenReturn(-0.39793998865280406);
        Mockito.when(mock.log10(eq(0.5, TEST_VALUE_PRECISION))).thenReturn(-0.301029959823809);
        Mockito.when(mock.log10(eq(0.8, TEST_VALUE_PRECISION))).thenReturn(-0.09690999020743597);
        Mockito.when(mock.log10(eq(1.0, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mock.log10(eq(1.5, TEST_VALUE_PRECISION))).thenReturn(0.17609121413575854);
        Mockito.when(mock.log10(eq(1.8466, TEST_VALUE_PRECISION))).thenReturn(0.26637283024633246);
        Mockito.when(mock.log10(eq(2.0, TEST_VALUE_PRECISION))).thenReturn(0.301029959823809);
        Mockito.when(mock.log10(eq(10.0, TEST_VALUE_PRECISION))).thenReturn(1.0);
        Mockito.when(mock.log10(eq(100.0, TEST_VALUE_PRECISION))).thenReturn(2.0000000401353115);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system/systemPositiveValues.csv")
    public void testValue(double x, double expected){
        fs.setX(x);
        fs.compute();
        Assertions.assertEquals(expected, fs.getResult(), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system/systemNegativeValues.csv")
    public void testOneFunctionIntegration(double x, double expected){
        Mockito.when(mock.ln(AdditionalMatchers.gt(0d))).thenCallRealMethod();
        fs.setX(x);
        fs.compute();
        Assertions.assertEquals(expected, fs.getResult(), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system/systemPositiveValues.csv")
    public void testTwoFunctionsIntegration(double x, double expected){
        Mockito.when(mock.ln(AdditionalMatchers.gt(0d))).thenCallRealMethod();
        Mockito.when(mock.log2(AdditionalMatchers.gt(0d))).thenCallRealMethod();
        fs.setX(x);
        fs.compute();
        Assertions.assertEquals(expected, fs.getResult(), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system/systemPositiveValues.csv")
    public void testThreeFunctionsIntegration(double x, double expected){
        Mockito.when(mock.ln(AdditionalMatchers.gt(0d))).thenCallRealMethod();
        Mockito.when(mock.log2(AdditionalMatchers.gt(0d))).thenCallRealMethod();
        Mockito.when(mock.log3(AdditionalMatchers.gt(0d))).thenCallRealMethod();
        fs.setX(x);
        fs.compute();
        Assertions.assertEquals(expected, fs.getResult(), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system/systemPositiveValues.csv")
    public void testFourFunctionsIntegration(double x, double expected){
        Mockito.when(mock.ln(AdditionalMatchers.gt(0d))).thenCallRealMethod();
        Mockito.when(mock.log2(AdditionalMatchers.gt(0d))).thenCallRealMethod();
        Mockito.when(mock.log3(AdditionalMatchers.gt(0d))).thenCallRealMethod();
        Mockito.when(mock.log5(AdditionalMatchers.gt(0d))).thenCallRealMethod();
        fs.setX(x);
        fs.compute();
        Assertions.assertEquals(expected, fs.getResult(), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system/systemPositiveValues.csv")
    public void testAllFunctionsIntegration(double x, double expected){
        Mockito.when(mock.ln(AdditionalMatchers.gt(0d))).thenCallRealMethod();
        Mockito.when(mock.log2(AdditionalMatchers.gt(0d))).thenCallRealMethod();
        Mockito.when(mock.log3(AdditionalMatchers.gt(0d))).thenCallRealMethod();
        Mockito.when(mock.log5(AdditionalMatchers.gt(0d))).thenCallRealMethod();
        Mockito.when(mock.log10(AdditionalMatchers.gt(0d))).thenCallRealMethod();
        fs.setX(x);
        fs.compute();
        Assertions.assertEquals(expected, fs.getResult(), TEST_VALUE_PRECISION);
    }
}

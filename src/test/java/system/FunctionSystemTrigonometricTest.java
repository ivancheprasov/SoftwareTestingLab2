package system;

import modules.TrigonometricFunctions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.mockito.Mockito;

import static org.mockito.AdditionalMatchers.eq;

public class FunctionSystemTrigonometricTest {
    private final static double TEST_VALUE_PRECISION = 1e-5;
    private static final TrigonometricFunctions mock = Mockito.mock(TrigonometricFunctions.class);
    private static final FunctionSystem fs = new FunctionSystem();

    @BeforeAll
    public static void init(){
        Mockito.doCallRealMethod().when(mock).setPrecision(TEST_VALUE_PRECISION);
        fs.setTrigonometricFunctions(mock);
        fs.setPrecision(TEST_VALUE_PRECISION);
        Mockito.when(mock.sin(eq(-6.283185307179586, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mock.sin(eq(-6.2731853071795864, TEST_VALUE_PRECISION))).thenReturn(0.00999983333333312);
        Mockito.when(mock.sin(eq(-5.763185307179597, TEST_VALUE_PRECISION))).thenReturn(0.49688013020185046);
        Mockito.when(mock.sin(eq(-5.7531853071795975, TEST_VALUE_PRECISION))).thenReturn(0.5055333321347525);
        Mockito.when(mock.sin(eq(-5.683185307179599, TEST_VALUE_PRECISION))).thenReturn(0.5646424457142752);
        Mockito.when(mock.sin(eq(-5.583185307179601, TEST_VALUE_PRECISION))).thenReturn(0.6442176877314894);
        Mockito.when(mock.sin(eq(-5.493185307179603, TEST_VALUE_PRECISION))).thenReturn(0.7103532742840036);
        Mockito.when(mock.sin(eq(-5.453185307179604, TEST_VALUE_PRECISION))).thenReturn(0.7379313743220393);
        Mockito.when(mock.sin(eq(-5.443185307179604, TEST_VALUE_PRECISION))).thenReturn(0.7446431236348371);
        Mockito.when(mock.sin(eq(-2.36318530717967, TEST_VALUE_PRECISION))).thenReturn(-0.7021462903172283);
        Mockito.when(mock.sin(eq(-2.35318530717967, TEST_VALUE_PRECISION))).thenReturn(-0.7092313920267889);
        Mockito.when(mock.sin(eq(-2.34318530717967, TEST_VALUE_PRECISION))).thenReturn(-0.7162455712206356);
        Mockito.when(mock.sin(eq(-1.1431853071796767, TEST_VALUE_PRECISION))).thenReturn(-0.9099591593288221);
        Mockito.when(mock.sin(eq(-1.1331853071796767, TEST_VALUE_PRECISION))).thenReturn(-0.9057667397762824);
        Mockito.when(mock.sin(eq(-1.1031853071796767, TEST_VALUE_PRECISION))).thenReturn(-0.892647752642548);
        Mockito.when(mock.sin(eq(-1.0431853071796766, TEST_VALUE_PRECISION))).thenReturn(-0.8640123560943049);
        Mockito.when(mock.sin(eq(-1.0331853071796766, TEST_VALUE_PRECISION))).thenReturn(-0.8589345290584477);
        Mockito.when(mock.sin(eq(-0.0031853071796758316, TEST_VALUE_PRECISION))).thenReturn(-0.0031853017932248606);
        Mockito.when(mock.sin(eq(0, TEST_VALUE_PRECISION))).thenReturn(0d);
        Mockito.when(mock.cos(eq(-6.283185307179586, TEST_VALUE_PRECISION))).thenReturn(0.999999943741051);
        Mockito.when(mock.cos(eq(-6.2731853071795864, TEST_VALUE_PRECISION))).thenReturn(0.9999499486323054);
        Mockito.when(mock.cos(eq(-5.763185307179597, TEST_VALUE_PRECISION))).thenReturn(0.8678192225798608);
        Mockito.when(mock.cos(eq(-5.7531853071795975, TEST_VALUE_PRECISION))).thenReturn(0.862807109138736);
        Mockito.when(mock.cos(eq(-5.683185307179599, TEST_VALUE_PRECISION))).thenReturn(0.8253356328832324);
        Mockito.when(mock.cos(eq(-5.583185307179601, TEST_VALUE_PRECISION))).thenReturn(0.764842192727246);
        Mockito.when(mock.cos(eq(-5.493185307179603, TEST_VALUE_PRECISION))).thenReturn(0.7038453172930799);
        Mockito.when(mock.cos(eq(-5.453185307179604, TEST_VALUE_PRECISION))).thenReturn(0.67487576099174);
        Mockito.when(mock.cos(eq(-5.443185307179604, TEST_VALUE_PRECISION))).thenReturn(0.6674628266340392);
        Mockito.when(mock.cos(eq(-2.36318530717967, TEST_VALUE_PRECISION))).thenReturn(-0.7120327183277617);
        Mockito.when(mock.cos(eq(-2.35318530717967, TEST_VALUE_PRECISION))).thenReturn(-0.7049757708737162);
        Mockito.when(mock.cos(eq(-2.34318530717967, TEST_VALUE_PRECISION))).thenReturn(-0.6978483264603628);
        Mockito.when(mock.cos(eq(-1.1431853071796767, TEST_VALUE_PRECISION))).thenReturn(0.4146981122456105);
        Mockito.when(mock.cos(eq(-1.1331853071796767, TEST_VALUE_PRECISION))).thenReturn(0.4237768160602397);
        Mockito.when(mock.cos(eq(-1.1031853071796767, TEST_VALUE_PRECISION))).thenReturn(0.4507550529510907);
        Mockito.when(mock.cos(eq(-1.0431853071796766, TEST_VALUE_PRECISION))).thenReturn(0.5034706626931382);
        Mockito.when(mock.cos(eq(-1.0331853071796766, TEST_VALUE_PRECISION))).thenReturn(0.5120854669305461);
        Mockito.when(mock.cos(eq(-0.0031853071796758316, TEST_VALUE_PRECISION))).thenReturn(0.999994872117009);
        Mockito.when(mock.cos(eq(0, TEST_VALUE_PRECISION))).thenReturn(1d);
        Mockito.when(mock.tan(eq(-6.283185307179586, TEST_VALUE_PRECISION))).thenReturn(0.0);
        Mockito.when(mock.tan(eq(-6.2731853071795864, TEST_VALUE_PRECISION))).thenReturn(0.010000333863720401);
        Mockito.when(mock.tan(eq(-5.763185307179597, TEST_VALUE_PRECISION))).thenReturn(0.5725617931401896);
        Mockito.when(mock.tan(eq(-5.7531853071795975, TEST_VALUE_PRECISION))).thenReturn(0.5859169758573056);
        Mockito.when(mock.tan(eq(-5.683185307179599, TEST_VALUE_PRECISION))).thenReturn(0.6841367599042707);
        Mockito.when(mock.tan(eq(-5.583185307179601, TEST_VALUE_PRECISION))).thenReturn(0.8422883751148218);
        Mockito.when(mock.tan(eq(-5.493185307179603, TEST_VALUE_PRECISION))).thenReturn(1.0092462886816562);
        Mockito.when(mock.tan(eq(-5.453185307179604, TEST_VALUE_PRECISION))).thenReturn(1.0934329205091589);
        Mockito.when(mock.tan(eq(-5.443185307179604, TEST_VALUE_PRECISION))).thenReturn(1.1156323527259366);
        Mockito.when(mock.tan(eq(-2.36318530717967, TEST_VALUE_PRECISION))).thenReturn(0.9861152054448395);
        Mockito.when(mock.tan(eq(-2.35318530717967, TEST_VALUE_PRECISION))).thenReturn(1.0060365495225438);
        Mockito.when(mock.tan(eq(-2.34318530717967, TEST_VALUE_PRECISION))).thenReturn(1.026362812752719);
        Mockito.when(mock.tan(eq(-1.1431853071796767, TEST_VALUE_PRECISION))).thenReturn(-2.194268872846681);
        Mockito.when(mock.tan(eq(-1.1331853071796767, TEST_VALUE_PRECISION))).thenReturn(-2.1373673722809983);
        Mockito.when(mock.tan(eq(-1.1031853071796767, TEST_VALUE_PRECISION))).thenReturn(-1.9803388709641487);
        Mockito.when(mock.tan(eq(-1.0431853071796766, TEST_VALUE_PRECISION))).thenReturn(-1.7161126161206226);
        Mockito.when(mock.tan(eq(-1.0331853071796766, TEST_VALUE_PRECISION))).thenReturn(-1.6773265099806953);
        Mockito.when(mock.tan(eq(-0.0031853071796758316, TEST_VALUE_PRECISION))).thenReturn(-0.0031853181271635058);
        Mockito.when(mock.tan(eq(0, TEST_VALUE_PRECISION))).thenReturn(0d);
        Mockito.when(mock.cot(eq(-6.283185307179586, TEST_VALUE_PRECISION))).thenReturn(Double.POSITIVE_INFINITY);
        Mockito.when(mock.cot(eq(-6.2731853071795864, TEST_VALUE_PRECISION))).thenReturn(99.99666147425725);
        Mockito.when(mock.cot(eq(-5.763185307179597, TEST_VALUE_PRECISION))).thenReturn(1.7465363773498481);
        Mockito.when(mock.cot(eq(-5.7531853071795975, TEST_VALUE_PRECISION))).thenReturn(1.7067264496592094);
        Mockito.when(mock.cot(eq(-5.683185307179599, TEST_VALUE_PRECISION))).thenReturn(1.4616960505673269);
        Mockito.when(mock.cot(eq(-5.583185307179601, TEST_VALUE_PRECISION))).thenReturn(1.1872418396652795);
        Mockito.when(mock.cot(eq(-5.493185307179603, TEST_VALUE_PRECISION))).thenReturn(0.9908384219141054);
        Mockito.when(mock.cot(eq(-5.453185307179604, TEST_VALUE_PRECISION))).thenReturn(0.9145508437173708);
        Mockito.when(mock.cot(eq(-5.443185307179604, TEST_VALUE_PRECISION))).thenReturn(0.8963526358451327);
        Mockito.when(mock.cot(eq(-2.36318530717967, TEST_VALUE_PRECISION))).thenReturn(1.0140802965804558);
        Mockito.when(mock.cot(eq(-2.35318530717967, TEST_VALUE_PRECISION))).thenReturn(0.9939996717560523);
        Mockito.when(mock.cot(eq(-2.34318530717967, TEST_VALUE_PRECISION))).thenReturn(0.9743143336594459);
        Mockito.when(mock.cot(eq(-1.1431853071796767, TEST_VALUE_PRECISION))).thenReturn(-0.45573266447637956);
        Mockito.when(mock.cot(eq(-1.1331853071796767, TEST_VALUE_PRECISION))).thenReturn(-0.4678652874413443);
        Mockito.when(mock.cot(eq(-1.1031853071796767, TEST_VALUE_PRECISION))).thenReturn(-0.5049640819872103);
        Mockito.when(mock.cot(eq(-1.0431853071796766, TEST_VALUE_PRECISION))).thenReturn(-0.5827123410237267);
        Mockito.when(mock.cot(eq(-1.0331853071796766, TEST_VALUE_PRECISION))).thenReturn(-0.5961868449879262);
        Mockito.when(mock.cot(eq(-0.0031853071796758316, TEST_VALUE_PRECISION))).thenReturn(-313.940385254546);
        Mockito.when(mock.cot(eq(0, TEST_VALUE_PRECISION))).thenReturn(Double.POSITIVE_INFINITY);
        Mockito.when(mock.sec(eq(-6.283185307179586, TEST_VALUE_PRECISION))).thenReturn(1.0000000562589522);
        Mockito.when(mock.sec(eq(-6.2731853071795864, TEST_VALUE_PRECISION))).thenReturn(1.0000500538729595);
        Mockito.when(mock.sec(eq(-5.763185307179597, TEST_VALUE_PRECISION))).thenReturn(1.1523137238504477);
        Mockito.when(mock.sec(eq(-5.7531853071795975, TEST_VALUE_PRECISION))).thenReturn(1.1590076036788934);
        Mockito.when(mock.sec(eq(-5.683185307179599, TEST_VALUE_PRECISION))).thenReturn(1.2116282881263638);
        Mockito.when(mock.sec(eq(-5.583185307179601, TEST_VALUE_PRECISION))).thenReturn(1.3074592504294735);
        Mockito.when(mock.sec(eq(-5.493185307179603, TEST_VALUE_PRECISION))).thenReturn(1.4207667159680795);
        Mockito.when(mock.sec(eq(-5.453185307179604, TEST_VALUE_PRECISION))).thenReturn(1.4817542098866985);
        Mockito.when(mock.sec(eq(-5.443185307179604, TEST_VALUE_PRECISION))).thenReturn(1.4982107768351964);
        Mockito.when(mock.sec(eq(-2.36318530717967, TEST_VALUE_PRECISION))).thenReturn(-1.4044298446685728);
        Mockito.when(mock.sec(eq(-2.35318530717967, TEST_VALUE_PRECISION))).thenReturn(-1.4184884662924566);
        Mockito.when(mock.sec(eq(-2.34318530717967, TEST_VALUE_PRECISION))).thenReturn(-1.432976138342576);
        Mockito.when(mock.sec(eq(-1.1431853071796767, TEST_VALUE_PRECISION))).thenReturn(2.411392698618644);
        Mockito.when(mock.sec(eq(-1.1331853071796767, TEST_VALUE_PRECISION))).thenReturn(2.3597326755549797);
        Mockito.when(mock.sec(eq(-1.1031853071796767, TEST_VALUE_PRECISION))).thenReturn(2.2184998114896457);
        Mockito.when(mock.sec(eq(-1.0431853071796766, TEST_VALUE_PRECISION))).thenReturn(1.9862130489408334);
        Mockito.when(mock.sec(eq(-1.0331853071796766, TEST_VALUE_PRECISION))).thenReturn(1.9527990239481439);
        Mockito.when(mock.sec(eq(-0.0031853071796758316, TEST_VALUE_PRECISION))).thenReturn(1.0000051279092863);
        Mockito.when(mock.sec(eq(0, TEST_VALUE_PRECISION))).thenReturn(1d);
        Mockito.when(mock.csc(eq(-6.283185307179586, TEST_VALUE_PRECISION))).thenReturn(Double.POSITIVE_INFINITY);
        Mockito.when(mock.csc(eq(-6.2731853071795864, TEST_VALUE_PRECISION))).thenReturn(100.00166669444705);
        Mockito.when(mock.csc(eq(-5.763185307179597, TEST_VALUE_PRECISION))).thenReturn(2.0125578368242745);
        Mockito.when(mock.csc(eq(-5.7531853071795975, TEST_VALUE_PRECISION))).thenReturn(1.978108932554906);
        Mockito.when(mock.csc(eq(-5.683185307179599, TEST_VALUE_PRECISION))).thenReturn(1.7710322835099572);
        Mockito.when(mock.csc(eq(-5.583185307179601, TEST_VALUE_PRECISION))).thenReturn(1.5522703257672756);
        Mockito.when(mock.csc(eq(-5.493185307179603, TEST_VALUE_PRECISION))).thenReturn(1.407750250757898);
        Mockito.when(mock.csc(eq(-5.453185307179604, TEST_VALUE_PRECISION))).thenReturn(1.3551395628336462);
        Mockito.when(mock.csc(eq(-5.443185307179604, TEST_VALUE_PRECISION))).thenReturn(1.3429251788678123);
        Mockito.when(mock.csc(eq(-2.36318530717967, TEST_VALUE_PRECISION))).thenReturn(-1.4242046334079497);
        Mockito.when(mock.csc(eq(-2.35318530717967, TEST_VALUE_PRECISION))).thenReturn(-1.409977069884448);
        Mockito.when(mock.csc(eq(-2.34318530717967, TEST_VALUE_PRECISION))).thenReturn(-1.396169191379133);
        Mockito.when(mock.csc(eq(-1.1431853071796767, TEST_VALUE_PRECISION))).thenReturn(-1.0989504196403619);
        Mockito.when(mock.csc(eq(-1.1331853071796767, TEST_VALUE_PRECISION))).thenReturn(-1.1040370065332632);
        Mockito.when(mock.csc(eq(-1.1031853071796767, TEST_VALUE_PRECISION))).thenReturn(-1.1202627206976683);
        Mockito.when(mock.csc(eq(-1.0431853071796766, TEST_VALUE_PRECISION))).thenReturn(-1.157390855520187);
        Mockito.when(mock.csc(eq(-1.0331853071796766, TEST_VALUE_PRECISION))).thenReturn(-1.1642330889831456);
        Mockito.when(mock.csc(eq(-0.0031853071796758316, TEST_VALUE_PRECISION))).thenReturn(-313.9419951123629);
        Mockito.when(mock.csc(eq(0, TEST_VALUE_PRECISION))).thenReturn(Double.POSITIVE_INFINITY);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system/systemNegativeValues.csv")
    public void testValue(double x, double expected){
        fs.setX(x);
        fs.compute();
        Assertions.assertEquals(expected, fs.getResult(), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system/systemNegativeValues.csv")
    public void testOneFunctionIntegration(double x, double expected){
        Mockito.when(mock.sin(Mockito.anyDouble())).thenCallRealMethod();
        fs.setX(x);
        fs.compute();
        Assertions.assertEquals(expected, fs.getResult(), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system/systemNegativeValues.csv")
    public void testTwoFunctionsIntegration(double x, double expected){
        Mockito.when(mock.sin(Mockito.anyDouble())).thenCallRealMethod();
        Mockito.when(mock.cos(Mockito.anyDouble())).thenCallRealMethod();
        fs.setX(x);
        fs.compute();
        Assertions.assertEquals(expected, fs.getResult(), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system/systemNegativeValues.csv")
    public void testThreeFunctionsIntegration(double x, double expected){
        Mockito.when(mock.sin(Mockito.anyDouble())).thenCallRealMethod();
        Mockito.when(mock.cos(Mockito.anyDouble())).thenCallRealMethod();
        Mockito.when(mock.tan(Mockito.anyDouble())).thenCallRealMethod();
        fs.setX(x);
        fs.compute();
        Assertions.assertEquals(expected, fs.getResult(), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system/systemNegativeValues.csv")
    public void testFourFunctionsIntegration(double x, double expected){
        Mockito.when(mock.sin(Mockito.anyDouble())).thenCallRealMethod();
        Mockito.when(mock.cos(Mockito.anyDouble())).thenCallRealMethod();
        Mockito.when(mock.tan(Mockito.anyDouble())).thenCallRealMethod();
        Mockito.when(mock.cot(Mockito.anyDouble())).thenCallRealMethod();
        fs.setX(x);
        fs.compute();
        Assertions.assertEquals(expected, fs.getResult(), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system/systemNegativeValues.csv")
    public void testFiveFunctionsIntegration(double x, double expected){
        Mockito.when(mock.sin(Mockito.anyDouble())).thenCallRealMethod();
        Mockito.when(mock.cos(Mockito.anyDouble())).thenCallRealMethod();
        Mockito.when(mock.tan(Mockito.anyDouble())).thenCallRealMethod();
        Mockito.when(mock.cot(Mockito.anyDouble())).thenCallRealMethod();
        Mockito.when(mock.sec(Mockito.anyDouble())).thenCallRealMethod();
        fs.setX(x);
        fs.compute();
        Assertions.assertEquals(expected, fs.getResult(), TEST_VALUE_PRECISION);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/system/systemNegativeValues.csv")
    public void testAllFunctionsIntegration(double x, double expected){
        Mockito.when(mock.sin(Mockito.anyDouble())).thenCallRealMethod();
        Mockito.when(mock.cos(Mockito.anyDouble())).thenCallRealMethod();
        Mockito.when(mock.tan(Mockito.anyDouble())).thenCallRealMethod();
        Mockito.when(mock.cot(Mockito.anyDouble())).thenCallRealMethod();
        Mockito.when(mock.sec(Mockito.anyDouble())).thenCallRealMethod();
        Mockito.when(mock.csc(Mockito.anyDouble())).thenCallRealMethod();
        fs.setX(x);
        fs.compute();
        Assertions.assertEquals(expected, fs.getResult(), TEST_VALUE_PRECISION);
    }
}

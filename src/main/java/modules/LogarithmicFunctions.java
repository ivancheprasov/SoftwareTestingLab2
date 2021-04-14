package modules;

import basicFunctions.LnCalculator;
import utils.ModuleNames;
import utils.PrintWriter;

public class LogarithmicFunctions {
    private double precision = 1e-5;

    public void setPrecision(double precision) {
        if (precision > 0) {
            this.precision = precision;
        } else {
            throw new IllegalArgumentException("Improper precision");
        }
    }

    public double ln(double x) {
        LnCalculator lnCalculator = new LnCalculator();
        lnCalculator.setX(x);
        lnCalculator.setPrecision(precision);
        lnCalculator.compute();
        double result = lnCalculator.getResult();
        PrintWriter.write(x, result, ModuleNames.LN);
        return result;
    }

    public double log2(double x) {
        double result = ln(x) / ln (2);
        PrintWriter.write(x, result, ModuleNames.LOG2);
        return result;
    }

    public double log3(double x) {
        double result = ln(x) / ln (3);
        PrintWriter.write(x, result, ModuleNames.LOG3);
        return result;
    }

    public double log5(double x) {
        double result = ln(x) / ln (5);
        PrintWriter.write(x, result, ModuleNames.LOG5);
        return result;
    }

    public double log10(double x) {
        double result = ln(x) / ln (10);
        PrintWriter.write(x, result, ModuleNames.LOG10);
        return result;
    }
}

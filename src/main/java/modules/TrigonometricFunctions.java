package modules;

import basicFunctions.SinCalculator;
import utils.ModuleNames;
import utils.PrintWriter;

public class TrigonometricFunctions {
    private double precision = 1e-5;

    public void setPrecision(double precision) {
        if (precision > 0) {
            this.precision = precision;
        } else {
            throw new IllegalArgumentException("Improper precision");
        }
    }

    public double sin(double x) {
        SinCalculator calculator = new SinCalculator();
        calculator.setX(x);
        calculator.setPrecision(precision);
        calculator.compute();
        double result = calculator.getResult();
        PrintWriter.write(x, result, ModuleNames.SIN);
        return result;
    }

    public double cos(double x) {
        double result = sin(x + Math.PI / 2);
        PrintWriter.write(x, result, ModuleNames.COS);
        return result;
    }

    public double tan(double x) {
        double result = sin(x) / cos(x);
        PrintWriter.write(x, result, ModuleNames.TAN);
        return result;
    }

    public double cot(double x) {
        double result = cos(x) / sin(x);
        PrintWriter.write(x, result, ModuleNames.COT);
        return result;
    }

    public double sec(double x) {
        double result = 1 / cos(x);
        PrintWriter.write(x, result, ModuleNames.SEC);
        return result;
    }

    public double csc(double x) {
        double result = 1 / sin(x);
        PrintWriter.write(x, result, ModuleNames.CSC);
        return result;
    }
}

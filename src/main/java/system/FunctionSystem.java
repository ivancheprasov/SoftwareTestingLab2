package system;

import modules.LogarithmicFunctions;
import modules.TrigonometricFunctions;
import utils.ModuleNames;
import utils.PrintWriter;

public class FunctionSystem {
    private double x;
    private double result;
    private TrigonometricFunctions trF = new TrigonometricFunctions();
    private LogarithmicFunctions lgF = new LogarithmicFunctions();

    public void setPrecision(double precision) {
        if (precision > 0) {
            trF.setPrecision(precision);
            lgF.setPrecision(precision);
        } else {
            throw new IllegalArgumentException("Improper precision");
        }
    }

    public void setTrigonometricFunctions(TrigonometricFunctions trF) {
        this.trF = trF;
    }

    public void setLogarithmicFunctions(LogarithmicFunctions lgF) {
        this.lgF = lgF;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getResult() {
        return result;
    }

    public void compute() {
        trF.csc(1);
        if (x <= 0) {
            double firstComputation = (((Math.pow(Math.pow(Math.pow(Math.pow(((((((Math.pow((Math.pow((((((Math.pow(trF.csc(x) - trF.tan(x), 3)) * trF.cot(x)) * (trF.sec(x) * trF.sec(x))) * trF.sec(x)) - trF.csc(x)) - (trF.csc(x) + trF.tan(x)), 2)) + trF.sin(x), 3)) + trF.sec(x)) / trF.cos(x)) + (trF.sin(x) + trF.sec(x))) - trF.sec(x)) + Math.pow(trF.tan(x), 2)) / ((((trF.sin(x) - (trF.cos(x) / (trF.cot(x) / trF.cos(x)))) / (Math.pow((trF.csc(x) - (trF.tan(x) - ((trF.tan(x) * trF.cot(x)) - trF.sec(x)))) * trF.tan(x), 3))) + (trF.sin(x) / trF.cos(x))) + trF.cot(x)), 2), 3), 3), 2)) + ((trF.sin(x) - (Math.pow((trF.csc(x) / ((trF.sin(x) + ((trF.tan(x) * trF.csc(x)) - trF.sin(x))) / (trF.csc(x) + (Math.pow((trF.tan(x) - trF.csc(x)) + (trF.sec(x) - trF.cot(x)), 2))))) - (trF.cot(x) - (trF.tan(x) + trF.cot(x))), 3))) + Math.pow(trF.cot(x), 2))) / (trF.sec(x) / trF.sec(x)));
            double secondComputation = (((((trF.csc(x) / (trF.cos(x) - ((trF.csc(x) + Math.pow(((trF.cot(x) / (trF.csc(x) * trF.csc(x))) / (trF.sec(x) + (trF.tan(x) - trF.cot(x)))), 2)) / trF.tan(x)))) - (trF.sin(x) / ((trF.csc(x) / trF.sec(x)) - trF.csc(x)))) + (trF.sin(x) * (Math.pow((((trF.tan(x) * ((trF.sin(x) / (Math.pow(trF.tan(x) * trF.sec(x), 2))) * (trF.tan(x) / ((trF.csc(x) - trF.cot(x)) * trF.csc(x))))) - trF.csc(x)) / (Math.pow((trF.sin(x) * (trF.csc(x) / (((trF.tan(x) / trF.cot(x)) + trF.sec(x)) + trF.sin(x)))) * (Math.pow((trF.sin(x) * trF.sec(x)) * trF.sin(x), 3)), 2))) + trF.tan(x), 3)))) * trF.tan(x)));
            double thirdComputation = (Math.pow(((Math.pow((Math.pow(Math.pow((trF.sin(x) - (trF.cot(x) / trF.sin(x))) - (trF.tan(x) / trF.cos(x)), 2), 3)) / trF.tan(x), 3)) * (((Math.pow(trF.cot(x), 3) * (trF.cos(x) * trF.cos(x))) + trF.sin(x)) + (trF.cos(x) / ((trF.sin(x) - (trF.sec(x) + trF.cos(x))) + ((trF.sec(x) * ((trF.csc(x) * ((trF.csc(x) / (trF.sec(x) * ((trF.sin(x) + trF.cot(x)) * trF.sin(x)))) / ((trF.sec(x) / (trF.cos(x) * trF.sec(x))) - trF.tan(x)))) - Math.pow(trF.sec(x), 2))) + trF.csc(x)))))) - trF.sin(x), 2));
            result = Math.pow(firstComputation + secondComputation + thirdComputation, 3);
        } else {
            result = (((Math.pow((lgF.log10(x) / lgF.log5(x)) - lgF.ln(x), 3)) / (Math.pow(lgF.log5(x), 3) * lgF.log2(x))) + (lgF.log2(x) - lgF.log3(x)));
        }
    }

    public void solveIteratively(double start, double end, double step) {
        if(start >= end) throw new IllegalArgumentException("Improper segment");
        if (step > 0) {
            for (double i = start; i <= end; i += step) {
                this.setX(i);
                this.compute();
                PrintWriter.write(x, this.getResult(), ModuleNames.SYSTEM);
            }
        } else {
            throw new IllegalArgumentException("Improper step");
        }
    }
}

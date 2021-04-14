package basicFunctions;

public class LnCalculator {
    private double precision = 1e-5;
    private double x;
    private double result;

    public void compute() {
        double result = 0;
        double rowElement = ((x - 1) / (x + 1));
        int n = 1;
        do {
            result += rowElement / n;
            rowElement *= Math.pow(((x - 1) / (x + 1)), 2);
            n += 2;
        } while (Math.abs(rowElement) > precision / 10);
        this.result = 2 * result;
    }

    public void setPrecision(double precision) {
        if (precision > 0) {
            this.precision = precision;
        } else {
            throw new IllegalArgumentException("Improper precision");
        }
    }

    public void setX(double x) {
        if (x > 0) {
            this.x = x;
        } else {
            throw new IllegalArgumentException("Improper logarithm argument");
        }
    }

    public double getResult() {
        return result;
    }
}

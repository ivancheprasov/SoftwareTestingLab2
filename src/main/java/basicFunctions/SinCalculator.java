package basicFunctions;

public class SinCalculator {
    private double precision = 1e-5;
    private double x;
    private double result;

    public void compute() {
        double result = 0;
        double x = this.x % (2 * Math.PI);
        if(Math.abs(x) > Math.PI) {
            if(x > 0) {
                x = - 2 * Math.PI + x;
            } else {
                x = 2 * Math.PI + x;
            }
        }
        if(Math.abs(x) > Math.PI/2) {
            if(x > 0) {
                x = Math.PI - x;
            } else {
                x = - Math.PI - x;
            }
        }
        double rowElement;
        int n = 1;
        double rowElementNumerator = x;
        long rowElementDenominator = 1;
        do {
            rowElement = rowElementNumerator / rowElementDenominator;
            result = n % 2 == 1 ? result + rowElement : result - rowElement;
            rowElementNumerator = rowElementNumerator * Math.pow(x, 2);
            n += 1;
            rowElementDenominator *= (2L * n - 2) * (2L * n - 1);
        } while (Math.abs(rowElement) > precision);
        this.result = result;
    }

    public void setPrecision(double precision) {
        if (precision > 0) {
            this.precision = precision;
        } else {
            throw new IllegalArgumentException("Improper precision");
        }
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getResult() {
        return result;
    }
}

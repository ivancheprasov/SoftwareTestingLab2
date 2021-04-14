import system.FunctionSystem;

public class Main {
    public static void main(String[] args) {
        FunctionSystem functionSystem = new FunctionSystem();
        functionSystem.solveIteratively(-2 * Math.PI,  Math.PI, 0.1);
    }
}

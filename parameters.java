class Calculator {
    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }
}

public class parameters {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Int Multiplication: " + calc.multiply(2, 3));
        System.out.println("Double Multiplication: " + calc.multiply(2.5, 3.5));
    }
}

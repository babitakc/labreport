
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

public class Method {
    public static void main(String[] args) {
        Calculator calc = new Calculator();  // Create object
        System.out.println("Sum: " + calc.add(10, 20));
    }
}


package java;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) { // Loop from 1 to num
            factorial *= i; // Multiply factorial by i
        }

        System.out.println("Factorial of " + num + " is " + factorial); // Print result
    }
}


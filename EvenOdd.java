package java;
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object
        System.out.print("Enter a number: ");
        int num = scanner.nextInt(); // Read user input

        if (num % 2 == 0) { // Check divisibility
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}

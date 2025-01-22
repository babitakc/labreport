package Datatypes;
public class LogicalOperatorsExample {
    public static void main(String[] args) {
        boolean isAdult = true;
        boolean hasID = false;

        // Using logical operators
        System.out.println("Can Enter (AND): " + (isAdult && hasID));
        System.out.println("Can Enter (OR): " + (isAdult || hasID));
        System.out.println("Not an Adult: " + (!isAdult));
    }
}

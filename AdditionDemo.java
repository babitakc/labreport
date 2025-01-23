/Custom package
package myPackages;
// File: Addition.java
public class Addition {
    public int add(int a, int b) {
        return a + b;
    }
}
//Main file which imports custom package
// File: AdditionDemo.java
import myPackages.Addition;
public class AdditionDemo {
    public static void main(String[] args) {
        Addition adds = new Addition();
        int num1 = 10, num2 = 5;
        System.out.println("Sum: " + adds.add(num1, num2));
      
    }
}


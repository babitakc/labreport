//custom package
package mypackages;
public class Greet {
    public void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }
}


//main file
package myPackageFiles;

import mypackages.Greet;
import java.util.Scanner;

public class GreetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Greet greet = new Greet();
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        greet.greetUser(name);
        sc.close();
    }
}

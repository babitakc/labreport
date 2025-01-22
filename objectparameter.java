class Person {
    String name;

    void greet(Person other) {
        System.out.println("Hello, " + other.name + "!");
    }
}

public class objectparameter {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Alice";
        Person p2 = new Person();
        p2.name = "Bob";
        p1.greet(p2);
    }
}

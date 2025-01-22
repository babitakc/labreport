package classes;

class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class keyword{
    public static void main(String[] args) {
        Employee emp = new Employee("Bob", 123);
        System.out.println("Employee: " + emp.name + ", ID: " + emp.id);
    }
}


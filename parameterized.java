package classes;
class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class parameterized {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101);
        System.out.println("Name: " + student.name + ", Roll No: " + student.rollNo);
    }
}


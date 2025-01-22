class Person {
    String name;

    static Person createPerson(String name) {
        Person p = new Person();
        p.name = name;
        return p;
    }
}

public class objectss{
    public static void main(String[] args) {
        Person person = Person.createPerson("Bob");
        System.out.println("Name: " + person.name);
    }
}
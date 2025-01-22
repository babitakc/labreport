package classes;

class Animal {
    String type;

    Animal(String type) {  // Constructor
        this.type = type;
    }
}

public class Consturator {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog");  // Create object
        System.out.println("Animal Type: " + dog.type);
    }
}


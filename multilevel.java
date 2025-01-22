
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Mammal extends Animal {
}

class Dog extends Mammal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class multilevel {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}


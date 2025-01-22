
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
}

public class Basicinheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
    }
}

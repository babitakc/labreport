package Inhertiance;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        super.sound();  // Call the parent class method
        System.out.println("Cat meows");
    }
}

public class parent {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
    }
}

package classes;
class Parent {
    Parent() {
        System.out.println("Parent Constructor");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("Child Constructor");
    }
}

public class inheritance {
    public static void main(String[] args) {
        Child child = new Child();
    }
}

package classes;

class Car {
    String brand;
    int year;

    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

public class arguments {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022);
        System.out.println("Brand: " + car.brand + ", Year: " + car.year);
    }
}

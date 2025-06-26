class Vehicle {
    String make, model;
    int year, maximumSpeed;

    Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle {
    Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    void drive() {
        System.out.println(make + " " + model + " Car is driving");
    }
}

class Bike extends Vehicle {
    Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    void drive() {
        System.out.println(make + " " + model + " Bike is driving");
    }
}

public class q1 {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Focus", 2022, 200);
        Bike bike = new Bike("Yamaha", "MT-15", 2023, 150);

        car.drive();
        System.out.println(car.make + " " + car.model + " " + car.year + " " + car.maximumSpeed);

        bike.drive();
        System.out.println(bike.make + " " + bike.model + " " + bike.year + " " + bike.maximumSpeed);
    }
}

public class Car {
    String make;
    String model;
    short year;
    int price;
    Car(String m, String mo, short y, int p) {
        make = m;
        model = mo;
        year = y;
        price = p;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Honda", "Civic", (short)2020, 12000000);
        System.out.println("Car Make: " + car1.make);
        System.out.println("Car Model: " + car1.model);
        System.out.println("Car Year: " + car1.year);
        System.out.println("Car Price: " + car1.price);
    }
}

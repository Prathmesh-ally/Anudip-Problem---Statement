class Shape {
    double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 3.14 * radius * radius;
    }
}

class Square extends Shape {
    int length;

    Square(int length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return length * length;
    }
}

public class q2 {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Square s = new Square(4);

        System.out.println("Circle area: " + c.getArea());
        System.out.println("Square area: " + s.getArea());
    }
}

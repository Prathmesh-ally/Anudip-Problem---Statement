public class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum1 = calc.add(5, 10);
        int sum2 = calc.add(3, 6, 9);
        double sum3 = calc.add(2.5, 4.7);
        System.out.println("Sum of 5 and 10 is: " + sum1);
        System.out.println("Sum of 3, 6, and 9 is: " + sum2);
        System.out.println("Sum of 2.5 and 4.7 is: " + sum3);
    }
}


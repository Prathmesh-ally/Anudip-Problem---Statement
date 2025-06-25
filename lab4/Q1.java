import java.util.Scanner;

public class Q1 {

    static void printArmstrongNumber(int start, int end) {
        for (int num = start; num <= end; num++) {
            int original = num, result = 0;
            while (original > 0) {
                int digit = original % 10;

                // Calculate cube using loop
                int cube = 1;
                for (int i = 0; i < 3; i++) {
                    cube = cube * digit;
                }

                result = result + cube;
                original /= 10;
            }
            if (result == num) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers:");
        printArmstrongNumber(start, end);
        sc.close();
    }
    
}

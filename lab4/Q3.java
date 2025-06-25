import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int evenCount = 0, oddCount = 0;

        while (true) {
            System.out.print("Enter a number : ");
            num = sc.nextInt();
            if (num == -1) break;

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total Even Numbers: " + evenCount);
        System.out.println("Total Odd Numbers: " + oddCount);
        sc.close();
    }
}

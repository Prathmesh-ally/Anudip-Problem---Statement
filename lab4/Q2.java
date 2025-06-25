import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice == -1) {
            System.out.print("Enter basic salary (int): ");
            int basic = sc.nextInt();

            int hra, da;

            if (basic > 15000) {
                hra = (basic * 20) / 100;
                da = (basic * 60) / 100;
            } else {
                hra = 3000;
                da = (basic * 70) / 100;
            }

            int gross = basic + hra + da;
            System.out.println("Gross Salary: " + gross);

            System.out.print("Enter -1 to continue, any other number to exit: ");
            choice = sc.nextInt();
        }
        sc.close();
    }
}

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); 
        scanner.close();
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial= factorial* i; 
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }                                                               
    
}

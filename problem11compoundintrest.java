import java.util.Scanner;
public class problem11compoundintrest {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal amount (P):");
        int principal = scanner.nextInt(); // Principal amount
        System.out.println("Enter the rate of interest (R) in percentage:");    
        int rate = scanner.nextInt(); // Rate of interest
        System.out.println("Enter the time period (T) in years:");
        int time = scanner.nextInt(); // Time period in years
        System.out.println("Enter the number of times interest is compounded per year (n):");
        int n = scanner.nextInt(); // Number of times interest is compounded per year
        scanner.close(); // Close the scanner to prevent resource leaks

        int amount = principal*(1+(rate/100/n)^(n*time));
        System.out.println("Compound Interest Amount: " + amount);
        
    }
}

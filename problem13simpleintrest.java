import java.util.Scanner;
public class problem13simpleintrest {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal amount ");
        int principal = scanner.nextInt(); // Principal amount
        System.out.println("Enter rate of interest ");      
        int rate = scanner.nextInt(); // Rate of interest
        System.out.println("Enter time period in years ");
        int time = scanner.nextInt(); // Time period in years
        scanner.close(); // Close the scanner to prevent resource leaks
        // Calculate Simple Interest
        int simpleintrest = principal*rate*time;
        System.out.println("Simple Interest Amount: " + simpleintrest);
        // Calculate Total Amount       
        int totalAmount = principal + simpleintrest;
        System.out.println("Total Amount after Simple Interest: " + totalAmount);
        // Calculate Total Amount with Interest
        
    }
}

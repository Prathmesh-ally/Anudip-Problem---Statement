import java.util.Scanner;

public class problem12multiplytwo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt(); // Read the first number
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt(); // Read the second number
        int product = num1 * num2; // Calculate the product of the two numbers
        System.out.println("The product of " + num1 + " and " + num2 + " is: " + product); // Output the product
        scanner.close(); // Close the scanner to prevent resource leaks
        
    }
}

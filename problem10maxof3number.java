import java.util.Scanner;
public class problem10maxof3number {
    public static void main(String [] args){
         Scanner scanner = new Scanner (System.in);
         System.out.println("Enter three numbers:");
         int num1 = scanner.nextInt();
         int num2 = scanner.nextInt();  
         int num3 = scanner.nextInt();
         int max; // Variable to store the maximum number
         // Compare the numbers to find the maximum
         if (num1 >= num2 && num1 >= num3) {
             max = num1; // num1 is the largest
         } else if (num2 >= num1 && num2 >= num3) {
             max = num2; // num2 is the largest
         } else {
             max = num3; // num3 is the largest
         }
            // Output the maximum number
            System.out.println("The maximum number is: " + max);
            scanner.close(); // Close the scanner to prevent resource leaks
    }
    
}

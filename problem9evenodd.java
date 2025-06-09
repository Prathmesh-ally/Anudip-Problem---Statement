import java.util.Scanner;
public class problem9evenodd {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        // Read an integer from the user
        int number = scanner.nextInt();
        

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}

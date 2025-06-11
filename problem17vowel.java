import java.util.Scanner;
public class problem17vowel {
    public static void main(String[] args) {
        System.out.println("Enter a character:");
        Scanner scanner = new Scanner(System.in);
        char v = scanner.next().charAt(0);
        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' ||
            v == 'A' || v == 'E' || v == 'I' || v == 'O' || v == 'U') {
            System.out.println("The character is a vowel.");
        } else {
            System.out.println("The character is not a vowel.");
        }
        scanner.close();
        System.out.println("Thank you for using the program!");
    }
}

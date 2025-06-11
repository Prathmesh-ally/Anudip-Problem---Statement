import java.util.Scanner;

public class problem16NumberDecoder {
    
    // Method to convert letters to corresponding phone digits
    public static String letterToDigit(char ch) {
        // If it's already a digit, return it as-is
        if (Character.isDigit(ch)) return String.valueOf(ch);

        // Map letters to digits like on a classic mobile keypad
        switch (ch) {
            case 'A': case 'B': case 'C': return "2";
            case 'D': case 'E': case 'F': return "3";
            case 'G': case 'H': case 'I': return "4";
            case 'J': case 'K': case 'L': return "5";
            case 'M': case 'N': case 'O': return "6";
            case 'P': case 'Q': case 'R': case 'S': return "7";
            case 'T': case 'U': case 'V': return "8";
            case 'W': case 'X': case 'Y': case 'Z': return "9";
            default: return ""; // For invalid characters
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 10-character phone number (letters/digits): ");
        String input = sc.nextLine().toUpperCase(); // Convert to uppercase

        String digits = "";

        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            digits += letterToDigit(ch); // Convert letters to digits
        }

        // Format only if we have 10 digits
        if (digits.length() == 10) {
            String formatted = "+91 " + digits.substring(0, 5) + "-" + digits.substring(5);
            System.out.println("Converted number: " + formatted);
        } else {
            System.out.println("Invalid input. Could not convert to a 10-digit number.");
        }

        sc.close();
    }
}

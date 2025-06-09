public class problem14leapyear {
    public static void main(String[] args) {
        int year = 2024; // Example year to check

        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
        //leap year condition: divisible by 4 and not divisible by 100, or divisible by 400 then leap year otherwise not leap year
         {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    
}

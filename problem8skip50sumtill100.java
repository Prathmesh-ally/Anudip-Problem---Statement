public class problem8skip50sumtill100 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i == 50) {
                continue; // Skip the number 50
            }
            sum = sum + i;
        }

        System.out.println("The sum from 1 to 100   is: " + sum);
    }
}

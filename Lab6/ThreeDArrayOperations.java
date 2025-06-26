import java.util.Random;

public class ThreeDArrayOperations {
    public static void main(String[] args) {
        int[][][] array = new int[3][3][3];
        Random rand = new Random();
        int sum = 0, max = Integer.MIN_VALUE;
        int count = 0;

        // Initialize array with random values and compute stats
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = rand.nextInt(100); // values between 0-99
                    sum += array[i][j][k];
                    count++;
                    if (array[i][j][k] > max) {
                        max = array[i][j][k];
                    }
                }
            }
        }

        // Display array
        System.out.println("3D Array Elements:");
        for (int[][] twoD : array) {
            for (int[] oneD : twoD) {
                for (int val : oneD) {
                    System.out.print(val + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Output results
        double average = (double) sum / count;
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);
    }
}

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        Integer[][] matrix1 = new Integer[rows][cols];
        Integer[][] matrix2 = new Integer[rows][cols];
        Integer[][] result = new Integer[rows][cols];

        // Input Matrix 1
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix1[i][j] = sc.nextInt();

        // Input Matrix 2
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix2[i][j] = sc.nextInt();

        // Perform addition
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                result[i][j] = matrix1[i][j] + matrix2[i][j];

        // Display Result
        System.out.println("Resultant Matrix:");
        for (Integer[] row : result) {
            for (Integer val : row)
                System.out.print(val + "\t");
            System.out.println();
        }

        sc.close();
    }
}

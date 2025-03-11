import java.util.Scanner;

public class TwoDArrays {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner initialized

        int rows = 3, col = 4; // Fixed matrix size
        int[][] num = new int[rows][col];

        // Input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {  // Fixed index range
            for (int j = 0; j < col; j++) {
                num[i][j] = sc.nextInt(); // Read user input
            }
        }

        // Output in matrix format
        System.out.println("The entered matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        sc.close(); // Close scanner at the end
    }
}

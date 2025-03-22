//. Check whether a matrix is symmetric.
import java.util.Scanner;

class exp14 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the size of the matrix:");
        int n = obj.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = obj.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    System.out.println("The matrix is not symmetric");
                    obj.close();
                    return;
                }
            }
        }

        System.out.println("The matrix is symmetric");
        obj.close();
    }
}

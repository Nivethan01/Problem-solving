import java.util.Scanner;

public class RotateMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = matrix.length;

        System.out.print("Enter the angle of rotation: ");
        int rotationAngle = scanner.nextInt();
        int rotations = rotationAngle / 90;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void rotateMatrix(int[][] matrix, int rotations) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        while (rotations > 0) {
            for (int i = 0; i < rows; i++) {
                for (int j = i; j < cols; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols / 2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][cols - 1 - j];
                    matrix[i][cols - 1 - j] = temp;
                }
            }

            rotations--;
        }
    }
}

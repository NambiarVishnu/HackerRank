
//F
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int leftToRightSum = 0;
        int rightToLeftSum = 0;

        for (int i = 0; i < n; i++) {
            leftToRightSum += matrix[i][i];
            rightToLeftSum += matrix[i][n - 1 - i];
        }

        int absoluteDifference = Math.abs(leftToRightSum - rightToLeftSum);

        System.out.println(absoluteDifference);

        scanner.close();
    }
}

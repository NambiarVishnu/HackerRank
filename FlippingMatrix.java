import java.util.Scanner;

public class FlippingMatrix {

    public static int result(int[][] matrix, int n) {
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int topLeft = matrix[i][j];
                int topRight = matrix[i][2 * n - j - 1];
                int bottomLeft = matrix[2 * n - i - 1][j];
                int bottomRight = matrix[2 * n - i - 1][2 * n - j - 1];
                maxSum += Math.max(topLeft, Math.max(topRight, Math.max(bottomLeft, bottomRight)));
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();

        for (int q = 0; q < queries; q++) {
            int n = sc.nextInt();
            int[][] matrix = new int[2 * n][2 * n];

            for (int i = 0; i < 2 * n; i++) {
                for (int j = 0; j < 2 * n; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            System.out.println(result(matrix, n));
        }

        sc.close();
    }
}

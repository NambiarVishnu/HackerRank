import java.util.Scanner;

public class MagicSquare {

    private static final int[][][] MAGIC_SQUARES = {
            { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } },
            { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
            { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } },
            { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
            { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } },
            { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } },
            { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } },
            { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } }
    };

    public static int formingMagicSquare(int[][] arr) {
        int minCost = Integer.MAX_VALUE;

        for (int[][] magicSquare : MAGIC_SQUARES) {
            int cost = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    cost += Math.abs(arr[i][j] - magicSquare[i][j]);
                }
            }
            minCost = Math.min(minCost, cost);
        }

        return minCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        System.out.println(formingMagicSquare(arr));
    }

}

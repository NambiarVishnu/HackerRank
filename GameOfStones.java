import java.util.Scanner;

public class GameOfStones {
    static String result(int m) {
        boolean[] firstWins = new boolean[m + 1];
        for (int i = 0; i <= m; i++) {
            for (int move : new int[] { 2, 3, 5 }) {
                if (i >= move && !firstWins[i - move]) {
                    firstWins[i] = true;
                    break;
                }
            }
        }

        return firstWins[m] ? "First" : "Second";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            System.out.println(result(m));
        }
        sc.close();
    }
}

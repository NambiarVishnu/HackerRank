import java.util.Arrays;
import java.util.Scanner;

public class GridChallenge {
    static String gridChallenge(String[] grid) {
        // Sort each row
        for (int x = 0; x < grid.length; x++) {
            char[] ar = grid[x].toCharArray();
            Arrays.sort(ar);
            grid[x] = new String(ar);
        }

        // Check each column
        for (int x = 0; x < grid[0].length(); x++) { // Use grid[0].length() to avoid index errors
            for (int y = 0; y < grid.length - 1; y++) {
                if (grid[y].charAt(x) > grid[y + 1].charAt(x)) {
                    return "NO";
                }
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String[] grid = new String[n];
            for (int j = 0; j < n; j++) {
                grid[j] = sc.next();
            }
            String result = gridChallenge(grid);
            System.out.println(result);
        }
        sc.close();
    }
}

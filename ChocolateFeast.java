
import java.util.Scanner;

public class ChocolateFeast {

    public static int chocolateFeast(int n, int c, int m) {
        // Calculate the initial chocolates bought
        int initialChocolates = n / c;
        int totalChocolates = initialChocolates;
        int wrappers = initialChocolates;

        // Exchange wrappers for additional chocolates
        while (wrappers >= m) {
            int newChocolates = wrappers / m; // Get new chocolates from wrappers
            totalChocolates += newChocolates; // Update total chocolates eaten
            wrappers = newChocolates + (wrappers % m); // Calculate remaining wrappers
        }

        return totalChocolates;
    }

    public static void main(String[] args) {
        ChocolateFeast instance = new ChocolateFeast();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // Money to spend
            int c = sc.nextInt(); // Cost of a chocolate
            int m = sc.nextInt(); // Wrappers needed for a free chocolate

            int result = instance.chocolateFeast(n, c, m); // Calculate chocolates eaten
            System.out.println(result); // Print result for each test case
        }
        sc.close();
    }
}

import java.util.Scanner;
import java.util.Arrays;

public class GreedyFlorist {
    static int result(int[] cost, int k) {
        Arrays.sort(cost);

        int totalCost = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            int friendIndex = (cost.length - 1 - i) / k;
            totalCost += (friendIndex + 1) * cost[i];
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int finalResult = result(c, k);
        System.out.println(finalResult);
        sc.close();
    }
}

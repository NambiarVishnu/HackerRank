import java.util.Scanner;
import java.util.Arrays;

public class ElectronicsShop {
    public int result(int budget, int[] n, int[] m) {
        Arrays.sort(m);
        int max = -1;
        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < m.length; j++) {
                sum = n[i] + m[j];
                if (sum <= budget && sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ElectronicsShop instance = new ElectronicsShop();
        int budget;
        int n;
        int m;
        Scanner sc = new Scanner(System.in);
        budget = sc.nextInt();
        n = sc.nextInt();
        m = sc.nextInt();
        int keyBoards[] = new int[n];
        int drives[] = new int[m];

        for (int i = 0; i < n; i++) {
            keyBoards[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            drives[i] = sc.nextInt();
        }
        int finalResult = instance.result(budget, keyBoards, drives);
        System.out.println(finalResult);

    }

}

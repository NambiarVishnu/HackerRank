import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LuckBalance {
    public int result(int[][] arr, int n, int k) {
        int totalLuck = 0;
        ArrayList<Integer> importance = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int luck = arr[i][0];
            int imp = arr[i][1];
            if (imp == 1) {
                importance.add(luck);
            } else {
                totalLuck += luck;
            }
        }

        Collections.sort(importance, Collections.reverseOrder());
        for (int j = 0; j < importance.size(); j++) {
            if (j < k) {
                totalLuck += importance.get(j);
            } else {
                totalLuck -= importance.get(j);
            }

        }
        return totalLuck;
    }

    public static void main(String[] args) {
        LuckBalance instance = new LuckBalance();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

            }

        }
        sc.close();

        int finalResult = instance.result(arr, n, k);
        System.out.println(finalResult);
    }

}

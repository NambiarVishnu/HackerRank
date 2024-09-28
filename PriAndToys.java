import java.util.Arrays;
import java.util.Scanner;

public class PriAndToys {
    public static int result(int[] weights) {
        Arrays.sort(weights);
        int containers = 0;
        int n = weights.length;
        int i = 0;
        while (i < n) {
            containers++;
            int minWeight = weights[i];
            while (i < n && weights[i] <= minWeight + 4) {
                i++;
            }
        }

        return containers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int finalResult = result(arr);
        System.out.println(finalResult);
        sc.close();
    }
}

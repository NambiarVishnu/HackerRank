import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static int maxMin(int k, int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= arr.length - k; i++) {
            int curr = arr[i + k - 1] - arr[i];
            min = Math.min(min, curr);
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = maxMin(k, arr);
        System.out.println(result);

        sc.close();
    }

}


//F
import java.util.Arrays;
import java.util.Scanner;

public class MinAbDiff {
    public int result(int[] arr) {
        int abs = 0;
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {

            abs = Math.abs(arr[i] - arr[i + 1]);
            if (abs < min) {
                min = abs;

            }

        }
        return min;

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        MinAbDiff arrSumInstance = new MinAbDiff();
        int finalSum = arrSumInstance.result(arr);
        System.out.println(finalSum);
    }
}

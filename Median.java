import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public int result(int[] arr) {
        Arrays.sort(arr);
        int mid = arr.length / 2;
        return arr[mid];
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Median arrSumInstance = new Median();
        int finalSum = arrSumInstance.result(arr);
        System.out.println(finalSum);
    }

}

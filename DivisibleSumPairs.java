import java.util.Scanner;

public class DivisibleSumPairs {
    public int divide(int[] a, int k) {
        int count = 0;

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if ((a[i] + a[j]) % k == 0) {
                    count++;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        DivisibleSumPairs arrSumInstance = new DivisibleSumPairs();
        int finalSum = arrSumInstance.divide(arr, k);
        System.out.println(finalSum);
    }

}

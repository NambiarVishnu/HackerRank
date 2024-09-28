
//F
import java.util.Scanner;

public class SubDivision {
    public int result(int[] a, int d, int m) {
        int count = 0;
        for (int i = 0; i <= a.length - m; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum += a[j];
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        SubDivision arrSumInstance = new SubDivision();
        int finalResult = arrSumInstance.result(arr, d, m);
        System.out.println(finalResult);
    }
}

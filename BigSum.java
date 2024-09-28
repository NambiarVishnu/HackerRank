
//F
import java.util.Scanner;

public class BigSum {
    public long result(long[] arr) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        BigSum BigSumInstance = new BigSum();
        long finalResult = BigSumInstance.result(arr);
        System.out.println(finalResult);
    }

}

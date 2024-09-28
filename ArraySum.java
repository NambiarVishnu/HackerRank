
//F
import java.util.Scanner;

public class ArraySum {
    public int result(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArraySum arrSumInstance = new ArraySum();
        int finalSum = arrSumInstance.result(arr);
        System.out.println(finalSum);
    }
}
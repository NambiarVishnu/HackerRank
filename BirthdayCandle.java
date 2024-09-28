
//F
import java.util.Scanner;

public class BirthdayCandle {
    public int result(int[] arr) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        BirthdayCandle arrSumInstance = new BirthdayCandle();
        int finalSum = arrSumInstance.result(arr);
        System.out.println(finalSum);
    }

}
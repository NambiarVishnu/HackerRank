
//F
import java.util.Scanner;

public class BillDivision {
    public int split(int[] a, int k, int b) {
        int sum = 0;
        int anDivide = 0;
        int totalSum = 0;
        int totalDivide;
        int overCharged = 0;
        for (int j = 0; j < a.length; j++) {
            totalSum += a[j];
        }

        totalDivide = totalSum / 2;

        for (int i = 0; i < a.length; i++) {
            if (i == k) {
                continue;
            } else {
                sum += a[i];
            }

        }

        anDivide = sum / 2;

        if (anDivide == b) {
            System.out.println("Bon Appetit");
        } else if (totalDivide > anDivide) {
            overCharged = totalDivide - anDivide;
            System.out.print(overCharged);
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();

        BillDivision arrInstance = new BillDivision();
        arrInstance.split(arr, k, b);
    }
}

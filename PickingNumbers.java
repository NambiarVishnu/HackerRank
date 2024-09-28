import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {
    public int result(int[] arr) {
        int newArr[] = new int[101];

        for (int i = 0; i < arr.length; i++) {
            newArr[arr[i]]++;
        }

        int max = 0;
        for (int i = 1; i < newArr.length; i++) {
            max = Math.max(max, newArr[i] + newArr[i - 1]);
        }
        return max;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        PickingNumbers instance = new PickingNumbers();
        int finalCount = instance.result(a);
        System.out.println(finalCount);
    }
}

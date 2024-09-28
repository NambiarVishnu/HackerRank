
//F
import java.util.Scanner;
import java.util.Arrays;

public class MaxPerimeterTriangle {
    public int[] result(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = n - 1; i >= 2; i--) {
            if (arr[i - 2] + arr[i - 1] > arr[i]) {
                return new int[] { arr[i - 2], arr[i - 1], arr[i] };
            }
        }
        return new int[] { -1 };
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        MaxPerimeterTriangle instance = new MaxPerimeterTriangle();
        int[] finalCount = instance.result(a);
        if (finalCount[0] == -1) {
            System.out.println(-1);
        } else {
            System.out.println(finalCount[0] + " " + finalCount[1] + " " + finalCount[2]);
        }
    }
}

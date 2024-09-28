
import java.util.*;

public class SansaXor {

    static int sansaXor(int[] arr) {
        int a = 0;
        int n = arr.length;
        if (n % 2 == 0) {
            return 0;
        }
        for (int x = 0; x < arr.length; x += 2) {
            a = a ^ arr[x];
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int arr_i = 0; arr_i < n; arr_i++) {
                arr[arr_i] = sc.nextInt();
            }
            int result = sansaXor(arr);
            System.out.println(result);
        }
        sc.close();
    }
}

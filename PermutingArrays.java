import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PermutingArrays {
    public static String result(int k, int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : B) {
            list.add(i);
        }
        Collections.reverse(list);

        for (int i = 0; i < A.length; i++) {
            if (A[i] + list.get(i) < k) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] A = new int[n];
            int[] B = new int[n];
            for (int j = 0; j < n; j++) {
                A[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                B[j] = sc.nextInt();
            }
            String finalResult = result(k, A, B);
            System.out.println(finalResult);
        }

        sc.close();
    }

}

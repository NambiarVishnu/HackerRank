import java.util.List;
import java.util.Scanner;

public class TwoSet {
    public static int max_sec(int B[], int m) {
        int max = B[0];
        for (int i = 1; i < m; i++) {
            if (max < B[i])
                max = B[i];
        }
        return max;
    }

    public static int max_first(int A[], int n) {
        int max = A[0];
        for (int i = 1; i < n; i++) {
            if (max < A[i])
                max = A[i];
        }
        return max;
    }

    public static int getTotalX(int A[], int B[], int n, int m) {

        int max1 = max_first(A, n);
        int max2 = max_sec(B, m);
        int flag = 0;
        int temp = 0;
        int count = 0;
        for (int i = max1; i <= max2; i++) {
            for (int j = 0; j < n; j++) {

                if (i % A[j] != 0)
                    flag = 1;
            }
            for (int k = 0; k < m; k++) {

                if (flag == 0) {
                    if (B[k] % i != 0)
                        temp = 1;
                }
            }
            if (flag == 0 && temp == 0)
                count++;
            flag = 0;
            temp = 0;
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[] = new int[n];
        int B[] = new int[m];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

        System.out.println(getTotalX(A, B, n, m));
    }
}

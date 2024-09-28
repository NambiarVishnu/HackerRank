import java.util.Scanner;

public class StairCase {
    public static void main(String[] args) {
        int n;
        int m = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // for (int j = n - i; j < n; j++) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= m; k++) {
                System.out.print("#");
            }
            System.out.println("");
            m++;
        }
    }

}

import java.util.Scanner;

public class MaxXor {

    public static int result(int n, int x) {
        int maxXor = 0;
        for (int i = n; i <= x; i++) {
            for (int j = n; j <= x; j++) {
                maxXor = Math.max(maxXor, i ^ j);
            }
        }
        return maxXor;
    }

    public static void main(String[] args) {
        MaxXor instance = new MaxXor();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int finalResult = instance.result(n, x);
        System.out.println(finalResult);
    }
}

import java.util.Scanner;

public class CounterGame {

    public static String result(long n) {
        int turns = 0;

        while (n > 0) {
            if ((n & (n - 1)) == 0) {
                n /= 2;
            } else {
                long largestPowerOfTwo = 1;
                while (largestPowerOfTwo <= n) {
                    largestPowerOfTwo <<= 1;
                }
                largestPowerOfTwo >>= 1;
                n -= largestPowerOfTwo;
            }
            turns++;
        }

        return (turns % 2 == 0) ? "Louise" : "Richard";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();

        for (int i = 0; i < z; i++) {
            long n = sc.nextLong();
            String finalResult = result(n);
            System.out.println(finalResult);
        }

        sc.close();
    }
}

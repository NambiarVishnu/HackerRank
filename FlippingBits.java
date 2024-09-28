import java.util.Scanner;

public class FlippingBits {
    public static long result(long n) {
        return 4294967295L - n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();

        for (int i = 0; i < z; i++) {
            long n = sc.nextLong();
            System.out.println(result(n));
        }

        sc.close();
    }
}

import java.util.Scanner;

public class SmartNumber {

    public static boolean result(int n) {
        return (Math.sqrt(n) % 1 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        for (int i = 0; i < z; i++) {
            int n = sc.nextInt();
            if (result(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

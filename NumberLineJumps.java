import java.util.Scanner;

public class NumberLineJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();

        boolean willMeet = false;
        for (int i = 0; i < 10000; i++) {
            if (x1 == x2) {
                willMeet = true;
                break;
            }
            x1 += v1;
            x2 += v2;
        }

        if (willMeet) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}

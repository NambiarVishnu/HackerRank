import java.util.Scanner;

public class Utopian {
    public int result(int n) {

        int height = 1;
        if (n == 0) {
            return 1;
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                height *= 2;
            } else {
                height += 1;

            }
        }
        return height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Utopian instance = new Utopian();

        int n = sc.nextInt();
        int m;
        for (int i = 0; i < n; i++) {
            m = sc.nextInt();
            int finalResult = instance.result(m);
            System.out.println(finalResult);
        }
        sc.close();

    }
}

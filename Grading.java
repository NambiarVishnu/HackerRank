import java.util.Scanner;

public class Grading {
    public int result(int m) {
        int x = m;
        int roundOff = 0;
        if (m < 38) {
            return m;
        } else if (m >= 38) {
            while (m % 5 != 0) {
                m++;
            }
            if (m - x < 3) {
                roundOff = m;
                return roundOff;

            }
        }
        return x;
    }

    public static void main(String[] args) {
        Grading instance = new Grading();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int finalResult = instance.result(m);
            System.out.println(finalResult);
        }
    }
}

import java.util.Scanner;

public class TowerBreaker {
    public int result(int t1, int t2) {

        return (t1 % 2 == 0 || t2 == 1) ? 2 : 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TowerBreaker instance = new TowerBreaker();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int finalResult = instance.result(t1, t2);
            System.out.println(finalResult);
        }
    }
}

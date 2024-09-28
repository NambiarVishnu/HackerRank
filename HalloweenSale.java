import java.util.ArrayList;
import java.util.Scanner;

public class HalloweenSale {
    public int result(int p, int d, int m, int s) {
        int currnet = p;
        int count = 1;
        int start = p;

        // ArrayList<Integer> arr = new ArrayList<>();
        while (s >= start) {
            currnet = currnet - d;

            if (currnet <= m) {
                currnet = m;
            }
            start += currnet;
            // s = s - currnet;
            count++;

        }
        return count - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int d = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        HalloweenSale instance = new HalloweenSale();
        int finalResult = instance.result(p, d, m, s);
        System.out.println(finalResult);
    }

}

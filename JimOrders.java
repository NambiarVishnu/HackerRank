import java.util.Scanner;
import java.util.*;

public class JimOrders {

    static void result(int[][] orders) {
        List<int[]> orderList = new ArrayList<>();
        for (int i = 0; i < orders.length; i++) {
            int totalTime = orders[i][0] + orders[i][1];
            orderList.add(new int[] { totalTime, i + 1 });
        }
        Collections.sort(orderList, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        for (int[] order : orderList) {
            System.out.print(order[1] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] orders = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                orders[i][j] = sc.nextInt();
            }
        }
        result(orders);
        sc.close();
    }
}

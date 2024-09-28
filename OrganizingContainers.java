import java.util.Arrays;
import java.util.Scanner;

public class OrganizingContainers {

    public static String result(int[][] container) {
        int n = container.length;
        int[] containerTotals = new int[n];
        int[] typeTotals = new int[n];
        for (int i = 0; i < n; i++) {
            int containerTotal = 0;
            for (int j = 0; j < n; j++) {
                containerTotal += container[i][j];
                typeTotals[j] += container[i][j];
            }
            containerTotals[i] = containerTotal;
        }
        Arrays.sort(containerTotals);
        Arrays.sort(typeTotals);
        if (Arrays.equals(containerTotals, typeTotals)) {
            return "Possible";
        } else {
            return "Impossible";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();

        for (int q = 0; q < queries; q++) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println(result(arr));
        }

        sc.close();
    }
}

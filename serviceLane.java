import java.util.Scanner;

public class serviceLane {

    public static int result(int[] a, int beginIndex, int endIndex) {
        int result = Integer.MAX_VALUE;
        for (int i = beginIndex; i <= endIndex; i++) {
            result = Math.min(result, a[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int z = sc.nextInt();
        int[] width = new int[n];
        for (int i = 0; i < width.length; i++) {
            width[i] = sc.nextInt();
        }
        for (int tc = 0; tc < z; tc++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(result(width, i, j));
        }

        sc.close();
    }

}

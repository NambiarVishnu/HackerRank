import java.util.Scanner;

public class HurdleRace {
    public int potion(int[] a, int hurdle) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            // max = Math.max(a[i], max);
            // }
            // System.out.println("max" + max);
            // if ((max - hurdle) < 0) {
            // drinks = Math.abs(max - hurdle);

            // } else {
            // drinks = 0;
            // }
            if (a[i] > max) {
                max = a[i];
            }

            // if (a[i] > hurdle) {
            // drinks = Math.abs(a[i] - hurdle);
            // break;
            // } else {
            // drinks = 0;
            // }

        }
        return hurdle > max ? 0 : max - hurdle;

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        HurdleRace plusMinusInstance = new HurdleRace();
        int result = plusMinusInstance.potion(arr, k);
        System.out.println(result);
    }
}

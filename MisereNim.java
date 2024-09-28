import java.util.Scanner;

public class MisereNim {
    public String result(int[] arr) {
        int n = arr.length;
        int total = 0;
        int xor = 0;
        for (int stones : arr) {
            total += stones;
            xor ^= stones;
        }
        if (n == 1) {
            return arr[0] > 1 ? "First" : "Second";
        }
        if (total == n) {
            return total % 2 == 0 ? "First" : "Second";
        }
        return xor > 0 ? "First" : "Second";
    }

    public static void main(String[] args) {
        MisereNim instance = new MisereNim();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            String finalResult = instance.result(arr);
            System.out.println(finalResult);
        }
        sc.close();
    }
}

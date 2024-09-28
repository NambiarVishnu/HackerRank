import java.util.Scanner;

public class Kaprekar {
    public int result(int n) {
        long square = (long) n * n;
        String S = String.valueOf(square);

        int mid = S.length() - String.valueOf(n).length();
        mid = Math.max(mid, 0);
        String firstHalf = S.substring(0, mid);
        String secondHalf = S.substring(mid);

        int first = firstHalf.isEmpty() ? 0 : Integer.parseInt(firstHalf);
        int second = secondHalf.isEmpty() ? 0 : Integer.parseInt(secondHalf);
        int ans = 0;
        if (first + second == n) {
            return n;
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kaprekar instance = new Kaprekar();
        int p = sc.nextInt();
        int q = sc.nextInt();

        boolean foundKaprekar = false;
        for (int i = p; i <= q; i++) {
            int n = instance.result(i);
            if (n != 0) {
                System.out.print(n + " ");
                foundKaprekar = true;
            }
        }

        if (!foundKaprekar) {
            System.out.println("INVALID RANGE");
        }
        sc.close();

    }
}

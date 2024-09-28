import java.util.Scanner;

public class FindDigits {
    public int result(int n) {
        int count = 0;
        int originalNumber = n;
        int lastDigit;

        while (n > 0) {
            lastDigit = n % 10;

            if (lastDigit != 0 && originalNumber % lastDigit == 0) {
                count++;
            }

            n = n / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        FindDigits findDigitsInstance = new FindDigits();
        int[] results = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            results[i] = findDigitsInstance.result(a);
        }

        sc.close();

        for (int i = 0; i < n; i++) {
            System.out.println(results[i]); // Output the result
        }
    }
}
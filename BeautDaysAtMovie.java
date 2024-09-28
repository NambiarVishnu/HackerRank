import java.util.Scanner;

public class BeautDaysAtMovie {
    public int result(int start, int end, int divisor) {
        int rev = 0;
        int count = 0;
        for (int i = start; i <= end; i++) {
            int startNum = i;
            rev = 0;
            while (startNum != 0) {
                int lastDigit = startNum % 10;
                rev = rev * 10 + lastDigit;
                startNum = startNum / 10;
            }

            if (Math.abs(i - rev) % divisor == 0) {
                count++;
            }

        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int divisor = sc.nextInt();
        sc.close();
        BeautDaysAtMovie instance = new BeautDaysAtMovie();
        int finalResult = instance.result(start, end, divisor);
        System.out.println(finalResult);
    }
}

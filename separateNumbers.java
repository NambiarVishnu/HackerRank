import java.util.Scanner;

public class separateNumbers {

    static void result(String s) {
        int n = s.length();

        for (int length = 1; length <= n / 2; length++) {
            String firstNum = s.substring(0, length);
            if (firstNum.length() > 1 && firstNum.charAt(0) == '0') {
                continue;
            }
            long currentNum = Long.parseLong(firstNum);
            StringBuilder constructed = new StringBuilder(firstNum);
            long nextNum = currentNum + 1;
            while (constructed.length() < n) {
                constructed.append(nextNum);
                nextNum++;
            }
            if (constructed.toString().equals(s)) {
                System.out.println("YES " + firstNum);
                return;
            }
        }

        System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < q; i++) {
            String s = scanner.nextLine().trim();
            result(s);
        }
        scanner.close();
    }
}

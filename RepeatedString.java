import java.util.Scanner;

public class RepeatedString {
    public long result(String S, long n) {

        if (S.length() == 1 && S.charAt(0) == 'a') {
            return n;
        }
        long countAInS = 0;
        for (char c : S.toCharArray()) {
            if (c == 'a') {
                countAInS++;
            }
        }

        long fullRepeats = n / S.length();

        long totalCount = fullRepeats * countAInS;

        long remainingChars = n % S.length();
        for (int i = 0; i < remainingChars; i++) {
            if (S.charAt(i) == 'a') {
                totalCount++;
            }
        }

        return totalCount;

    }

    public static void main(String[] args) {
        String S;
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        long n;
        n = sc.nextLong();
        RepeatedString InstanceString = new RepeatedString();
        long finalResult = InstanceString.result(S, n);
        System.out.println(finalResult);
    }
}

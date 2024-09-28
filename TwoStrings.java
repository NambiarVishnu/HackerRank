import java.util.HashSet;
import java.util.Scanner;

public class TwoStrings {
    public String result(String S, String X) {
        // for (int i = 0; i < S.length(); i++) {
        // for (int j = 0; j < X.length(); j++) {
        // if (S.charAt(i) == X.charAt(j)) {
        // return "YES";
        // }
        // }
        // }
        // return "NO";
        HashSet<Character> chars = new HashSet<>();
        for (char c : S.toCharArray()) {
            chars.add(c);
        }
        for (char c : X.toCharArray()) {
            if (chars.contains(c)) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TwoStrings instance = new TwoStrings();
        int n = sc.nextInt();
        sc.nextLine();
        String S;
        String X;

        for (int i = 0; i < n; i++) {
            S = sc.nextLine();
            X = sc.nextLine();
            String finalResult = instance.result(S, X);
            System.out.println(finalResult);
        }
        sc.close();

    }
}

import java.util.Scanner;

public class Anagr {

    public int result(String S) {
        int count = 0;
        if (S.length() % 2 != 0) {
            return -1;
        }
        int mid = S.length() / 2;
        String s1 = S.substring(0, mid);
        String s2 = S.substring(mid);

        // for (int i = 0; i < s1.length(); i++) {
        // if (s1.charAt(i) != s2.charAt(s2.length() - 1 - i)) {
        // count++;
        // }

        // }
        // return count;
        for (int x = 97; x <= 122; x++) {
            int q = 0, w = 0;
            for (int y = 0; y < s1.length(); y++) {
                if (s1.charAt(y) == x) {
                    q++;
                }
                if (s2.charAt(y) == x) {
                    w++;
                }
            }
            count += Math.min(q, w);
        }
        return s1.length() - count;
    }

    public static void main(String[] args) {
        Anagr instance = new Anagr();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String S = sc.nextLine();
            int finalResult = instance.result(S);
            System.out.println(finalResult);

        }

    }
}

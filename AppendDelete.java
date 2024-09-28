import java.util.*;

public class AppendDelete {
    static String appendAndDelete(String s1, String s2, int k) {
        if (s1.equals(s2)) {
            return "Yes";
        }
        int x = 1;
        while (x < s1.length() && x < s2.length() && (s1.substring(0, x).equals(s2.substring(0, x)))) {
            x++;
        }
        if (k == (s1.length() - 2 * (x - 1) + s2.length())) {
            return "Yes";
        }
        if (x == 1) {
            if (k >= s1.length() + s2.length()) {
                return "Yes";
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int k = sc.nextInt();
        String result = appendAndDelete(s1, s2, k);
        System.out.println(result);
        sc.close();
    }
}

import java.util.Scanner;

public class XorString {
    public String result(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                result.append('0');
            } else {
                result.append('1');
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        XorString instance = new XorString();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        String finalResult = instance.result(s1, s2);
        System.out.println(finalResult);
        sc.close();
    }
}

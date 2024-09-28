import java.util.Scanner;

public class hackerrankString {
    public String result(String S) {
        String target = "hackerrank";
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == target.charAt(count)) {
                count++;
            }

            if (count == target.length()) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String S = sc.nextLine();

            hackerrankString instance = new hackerrankString();
            String finalResult = instance.result(S);
            System.out.println(finalResult);

        }

    }
}

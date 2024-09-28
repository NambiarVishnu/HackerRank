
import java.util.HashSet;
import java.util.Scanner;

public class StringConstruction {

    public int result(String s) {
        HashSet<Character> uniqueChars = new HashSet<>();

        for (char c : s.toCharArray()) {
            uniqueChars.add(c);
        }

        return uniqueChars.size();
    }

    public static void main(String[] args) {
        StringConstruction instance = new StringConstruction();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            int finalResult = instance.result(s);
            System.out.println(finalResult);
        }

        sc.close();
    }
}

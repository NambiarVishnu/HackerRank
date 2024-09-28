
//F
import java.util.Scanner;

public class AlternatingCharacter {
    public int result(String S) {
        int delete = 0;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                delete++;
            }

        }
        return delete;
    }

    public static void main(String[] args) {
        String S;
        int n;
        AlternatingCharacter instance = new AlternatingCharacter();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            S = sc.nextLine();
            int deletions = instance.result(S);
            System.out.println(deletions);
        }

    }
}

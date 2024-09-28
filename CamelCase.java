
//F
import java.util.Scanner;

public class CamelCase {
    public int result(String S) {
        int count = 1;
        String Z = S.toUpperCase();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == Z.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String S;
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        CamelCase CaseInstance = new CamelCase();
        int finalResult = CaseInstance.result(S);
        System.out.println(finalResult);
    }
}

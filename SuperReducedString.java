
//F
import java.util.Scanner;

public class SuperReducedString {
    public String result(String S) {
        StringBuilder reducedString = new StringBuilder(S);
        boolean hasPair = true;

        while (hasPair) {
            hasPair = false;
            for (int i = 0; i < reducedString.length() - 1; i++) {
                if (reducedString.charAt(i) == reducedString.charAt(i + 1)) {
                    // char c = S.charAt(i - 1);
                    reducedString.delete(i, i + 2);
                    hasPair = true;
                    break;

                }
            }
        }

        return reducedString.length() == 0 ? "Empty String" : reducedString.toString();
    }

    public static void main(String[] args) {
        String S;
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        SuperReducedString instance = new SuperReducedString();
        String X = instance.result(S);
        System.out.println(X);
    }

}

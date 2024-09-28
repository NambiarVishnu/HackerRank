import java.util.ArrayList;
import java.util.Scanner;

public class FunnyString {
    public String result(String S) {
        ArrayList<Character> X = new ArrayList<>();
        int sArr[] = new int[S.length() - 1];
        int XArr[] = new int[S.length() - 1];

        for (int i = S.length() - 1; i >= 0; i--) {
            char put = S.charAt(i);
            X.add(put);
        }

        for (int i = 0; i < S.length() - 1; i++) {
            sArr[i] = (int) Math.abs((S.charAt(i) - S.charAt(i + 1)));

        }
        for (int i = 0; i < X.size() - 1; i++) {
            XArr[i] = (int) Math.abs((X.get(i) - X.get(i + 1)));

        }
        int j = 0;
        while (j < S.length() - 1) {
            if (sArr[j] != XArr[j]) {
                return "Not Funny";
            }
            j++;
        }
        return "Funny";

    }

    public static void main(String[] args) {
        FunnyString instance = new FunnyString();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String S = sc.nextLine();
            String finalResult = instance.result(S);
            System.out.println(finalResult);

        }
        sc.close();
    }
}

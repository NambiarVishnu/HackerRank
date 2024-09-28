import java.util.HashSet;
import java.util.Scanner;

public class Pangrams {
    public String result(String S) {
        String s = S.toLowerCase();
        int alphabets = 26;
        char arr[] = s.toCharArray();

        HashSet<Character> count = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            char c = arr[i];
            if (Character.isLetter(c)) {
                count.add(c);

            }

        }

        return count.size() == alphabets ? "pangram" : "not pangram";

    }

    public static void main(String[] args) {
        String S;
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine();
        Pangrams instancePangrams = new Pangrams();
        String finalResult = instancePangrams.result(S);
        System.out.println(finalResult);
    }

}

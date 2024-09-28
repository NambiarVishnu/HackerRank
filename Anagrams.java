import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String X = sc.nextLine();
        int deletion = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }
        for (int i = 0; i < X.length(); i++) {
            map.put(X.charAt(i), map.getOrDefault(X.charAt(i), 0) - 1);
        }
        for (int value : map.values()) {
            deletion += Math.abs(value);
        }

        System.out.print(deletion);

    }

}

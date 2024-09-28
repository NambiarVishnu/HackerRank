import java.util.HashMap;
import java.util.Scanner;

public class GOT {
    public String result(String A) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            map.put(A.charAt(i), map.getOrDefault(A.charAt(i), 0) + 1);
        }

        int oddCount = 0;
        for (int count : map.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // Check the conditions for an anagram of a palindrome
        if (oddCount <= 1) {
            return "YES";
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        GOT instance = new GOT();
        String Z = instance.result(S);
        System.out.println(Z);
    }

}

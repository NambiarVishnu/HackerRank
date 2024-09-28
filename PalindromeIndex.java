import java.util.Scanner;

public class PalindromeIndex {
    public int result(String S) {
        int n = S.length();
        for (int i = 0; i < n / 2; i++) { 
            if (S.charAt(i) != S.charAt(n - 1 - i)) {
\                if (isPalindrome(S, i + 1, n - 1 - i)) {
                    return i; 
                } else if (isPalindrome(S, i, n - 2 - i)) {
                    return n - 1 - i; 
                }
                return -1; 
            }
        }
        return -1; 
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeIndex instance = new PalindromeIndex();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String S = sc.nextLine();
            int finalResult = instance.result(S);
            System.out.println(finalResult);
        }
        sc.close();
    }
}

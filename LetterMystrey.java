import java.util.Scanner;

public class LetterMystrey {
    public int result(String S) {
        int operation = 0;
        int left = 0;
        int right = S.length() - 1;
        while (left < right) {
            int temp = Math.abs(S.charAt(left) - S.charAt(right));
            operation += temp;
            left++;
            right--;
        }
        return operation;
    }

    public static void main(String[] args) {
        LetterMystrey instance = new LetterMystrey();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String S = sc.nextLine();
            int finalResult = instance.result(S);
            System.out.println(finalResult);
        }

    }

}

import java.util.Arrays;
import java.util.Scanner;

public class DesignerPDF {
    public int result(int[] arr, String S) {
        int length = S.length();
        int[] string = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            int asciiValue = (int) (S.charAt(i));
            int alpha = asciiValue - 97;
            string[i] = arr[alpha];
        }
        Arrays.sort(string);
        int max = string[string.length - 1];
        return max * length;
    }

    public static void main(String[] args) {
        int[] arr = new int[26];
        DesignerPDF instance = new DesignerPDF();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        String S = sc.nextLine();

        int finalResult = instance.result(arr, S);
        System.out.println(finalResult);

    }

}

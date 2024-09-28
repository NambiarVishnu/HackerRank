import java.util.Scanner;

public class BeBinaryString {
    public int result(String S) {
        int count = 0;
        for (int i = 0; i <= S.length() - 3; i++) {
            if (S.substring(i, i + 3).equals("010")) {
                count++;
                i += 2;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        BeBinaryString instance = new BeBinaryString();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        int finalResult = instance.result(S);
        System.out.println(finalResult);
    }

}

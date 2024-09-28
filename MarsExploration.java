import java.util.Scanner;

public class MarsExploration {
    public int result(String S) {
        String X = "SOS";
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != X.charAt(i % 3)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        MarsExploration instance = new MarsExploration();
        int finalResult = instance.result(S);
        System.out.println(finalResult);
    }
}

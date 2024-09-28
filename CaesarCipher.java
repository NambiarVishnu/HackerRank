import java.util.Scanner;

public class CaesarCipher {
    public String result(int n, String S, int k) {
        char[] encrypt = new char[S.length()];
        for (int i = 0; i < S.length(); i++) {
            char z = S.charAt(i);
            if (Character.isLetter(z)) {

                char base = Character.isLowerCase(z) ? 'a' : 'A';
                encrypt[i] = (char) ((z - base + k) % 26 + base);
            } else {
                encrypt[i] = z;
            }
        }
        return new String(encrypt);
    }

    public static void main(String[] args) {
        CaesarCipher instance = new CaesarCipher();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        int k = sc.nextInt();
        String finalresult = instance.result(n, S, k);
        System.out.println(finalresult);
    }
}

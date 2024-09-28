import java.util.Scanner;

public class sequence {

    public static int[] permutationEquation(int[] p) {
        int n = p.length;
        int[] result = new int[n];

        int[] index = new int[n + 1];
        for (int i = 0; i < n; i++) {
            index[p[i]] = i + 1;
        }

        for (int y = 1; y <= n; y++) {
            int x = index[y];
            result[y - 1] = index[x];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int[] result = permutationEquation(p);

        for (int value : result) {
            System.out.println(value);
        }

        sc.close();
    }
}

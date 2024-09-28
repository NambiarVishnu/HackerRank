import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class ManasaStones {

    public int[] result(int n, int a, int b) {
        HashSet<Integer> possibleValues = new HashSet<>();
        for (int x = 0; x < n; x++) {
            int lastStoneValue = (x * a) + ((n - 1 - x) * b);
            possibleValues.add(lastStoneValue);
        }
        if (a == b) {
            return new int[] { (n - 1) * a };
        }

        int[] resultArr = possibleValues.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(resultArr);

        return resultArr;
    }

    public static void main(String[] args) {
        ManasaStones instance = new ManasaStones();
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int n, a, b;

        for (int i = 0; i < X; i++) {
            n = sc.nextInt();
            a = sc.nextInt();
            b = sc.nextInt();
            int[] finalResult = instance.result(n, a, b);
            for (int j = 0; j < finalResult.length; j++) {
                System.out.print(finalResult[i] + " ");

            }
            System.out.println("");

        }

        sc.close();
    }
}

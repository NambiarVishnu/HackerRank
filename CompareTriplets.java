
//F
import java.util.Scanner;

public class CompareTriplets {

    public int[] compare(int[] a, int[] b) {
        int aCount = 0;
        int bCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
                continue;

            } else if (a[i] > b[i]) {
                aCount++;
            } else
                bCount++;
        }
        return new int[] { aCount, bCount };

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int[] fArr = new int[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = sc.nextInt();
        }
        int[] sArr = new int[3];
        for (int i = 0; i < 3; i++) {
            sArr[i] = sc.nextInt();
        }
        CompareTriplets arrInstance = new CompareTriplets();
        int[] result = arrInstance.compare(fArr, sArr);
        System.out.println(result[0] + " " + result[1]);
    }

}

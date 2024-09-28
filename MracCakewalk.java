import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MracCakewalk {
    public long multiply(Long[] a) {
        Arrays.sort(a, Collections.reverseOrder());
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            long powerTwo = (long) Math.pow(2, i);
            result = powerTwo * a[i] + result;
            // System.out.println(result);
        }
        return result;

    }

    public static void main(String[] args) {
        long n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();

        Long arr[] = new Long[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        MracCakewalk arrSumInstance = new MracCakewalk();
        long finalSum = arrSumInstance.multiply(arr);
        System.out.println(finalSum);
    }

}

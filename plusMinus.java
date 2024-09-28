
//F
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class plusMinus {
    public float[] posNeg(int[] a, int n) {
        List<Integer> posList = new ArrayList<>();
        List<Integer> negList = new ArrayList<>();
        List<Integer> zerList = new ArrayList<>();
        float posValue = 0;
        float negValue = 0;
        float zero = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                posList.add(a[i]);
            } else if (a[i] < 0) {
                negList.add(a[i]);
            } else if (a[i] == 0) {
                zerList.add(a[i]);
            }
        }

        posValue = (float) posList.size() / n;
        negValue = (float) negList.size() / n;
        zero = (float) zerList.size() / n;

        return new float[] { posValue, negValue, zero };

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        plusMinus plusMinusInstance = new plusMinus();
        float[] result = plusMinusInstance.posNeg(arr, n);
        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(result[2]);
    }

}

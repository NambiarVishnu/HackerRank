import java.util.Scanner;

public class BreakingRecord {
    public int[] result(int[] a) {
        int min = a[0];
        int max = a[0];
        int minCount = 0;
        int maxCount = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxCount++;
            } else if (a[i] < min) {
                min = a[i];
                minCount++;
            }
        }
        return new int[] { maxCount, minCount };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        BreakingRecord arrSumInstance = new BreakingRecord();
        int[] finalResult = arrSumInstance.result(arr);
        System.out.println(finalResult[0] + " " + finalResult[1]);

    }
}

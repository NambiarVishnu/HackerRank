
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CountingSort2 {
    public int[] result(int[] arr) {
        Arrays.sort(arr);
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] countArray = new int[max + 1];

        for (int i = 0; i < arr.length; i++) {
            int j = arr[i];

            countArray[j] += 1;

        }
        int[] sortedArray = new int[arr.length];
        int index = 0;

        for (int i = 0; i < countArray.length; i++) {
            while (countArray[i] > 0) {
                sortedArray[index++] = i;
                countArray[i]--;
            }
        }
        return sortedArray;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        CountingSort2 instance = new CountingSort2();
        int[] finalResult = instance.result(arr);
        for (int i = 0; i < finalResult.length; i++) {
            System.out.print(finalResult[i] + " ");

        }

    }

}

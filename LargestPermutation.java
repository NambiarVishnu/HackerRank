import java.util.Scanner;
import java.util.*;

public class LargestPermutation {
    public static int[] result(int k, int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }

        for (int i = 0; i < n && k > 0; i++) {
            int currentValue = arr[i];
            int largestPossibleValue = n - i;
            if (currentValue == largestPossibleValue) {
                continue;
            }
            int indexOfLargestPossibleValue = indexMap.get(largestPossibleValue);
            arr[i] = largestPossibleValue;
            arr[indexOfLargestPossibleValue] = currentValue;
            indexMap.put(currentValue, indexOfLargestPossibleValue);
            indexMap.put(largestPossibleValue, i);
            k--;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = result(k, arr);
        for (int value : result) {
            System.out.print(value + " ");

        }

        sc.close();
    }
}

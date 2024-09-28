import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ClosestNumber {
    public ArrayList<Integer> result(int[] arr) {
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        ArrayList<Integer> minDiff = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            int temp = Math.abs(arr[i] - arr[i + 1]);
            if (temp < min) {
                min = temp;
                minDiff.clear();
                minDiff.add(arr[i]);
                minDiff.add(arr[i + 1]);
            } else if (temp == min) {
                minDiff.add(arr[i]);
                minDiff.add(arr[i + 1]);
            }
        }
        return minDiff;
    }

    public static void main(String[] args) {
        ClosestNumber instance = new ClosestNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        ArrayList<Integer> finalResult = instance.result(arr);
        Collections.sort(finalResult);
        for (int i = 0; i < finalResult.size(); i++) {
            System.out.print(finalResult.get(i) + " ");
        }
    }
}

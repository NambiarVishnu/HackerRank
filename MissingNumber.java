import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class MissingNumber {
    public static ArrayList<Integer> result(int[] arr, int[] brr) {
        HashMap<Integer, Integer> freqMapArr = new HashMap<>();
        HashMap<Integer, Integer> freqMapBrr = new HashMap<>();
        for (int i : arr) {
            freqMapArr.put(i, freqMapArr.getOrDefault(i, 0) + 1);
        }
        for (int j : brr) {
            freqMapBrr.put(j, freqMapBrr.getOrDefault(j, 0) + 1);
        }

        ArrayList<Integer> missingNumbers = new ArrayList<>();
        for (int i : freqMapBrr.keySet()) {
            if (freqMapBrr.get(i) > freqMapArr.getOrDefault(i, 0)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] brr = new int[m];
        for (int i = 0; i < brr.length; i++) {
            brr[i] = sc.nextInt();
        }
        ArrayList<Integer> finalResult = result(arr, brr);
        if (finalResult.isEmpty()) {
            System.out.println("No missing numbers");
        } else {
            System.out.println(String.join(" ", finalResult.stream().map(String::valueOf).toArray(String[]::new)));
        }
    }
}

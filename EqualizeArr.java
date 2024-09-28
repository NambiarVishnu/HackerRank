
//F
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class EqualizeArr {
    public int result(int[] arr) {
        int count = 1;
        int n = arr.length;
        int equal = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        for (int freq : map.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }
        // HashSet<Integer> duplicate = new HashSet<>();
        // // System.out.println("no. of ele" + n);
        // for (int num : arr) {
        // if (duplicate.contains(num))
        // count++;
        // else
        // duplicate.add(num);
        // }

        equal = n - maxFreq;
        return equal;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        EqualizeArr arrSumInstance = new EqualizeArr();
        int finalResult = arrSumInstance.result(arr);
        System.out.println(finalResult);
        sc.close();

    }

}

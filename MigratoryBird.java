import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

public class MigratoryBird {
    public int result(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int max = 0;
        int mostBird = -1;
        for (int c : map.keySet()) {
            int freq = map.get(c);
            if (freq > max || ((freq == max) && c < mostBird)) {
                max = freq;
                mostBird = c;
            }
        }
        return mostBird;
    }

    public static void main(String[] args) {
        MigratoryBird instance = new MigratoryBird();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int finalResult = instance.result(arr);
        System.out.println(finalResult);
    }
}

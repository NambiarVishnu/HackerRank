
//F
import java.util.Arrays;
import java.util.Scanner;

public class MarksAndToys {
    public int result(int[] arr, int budget) {
        Arrays.sort(arr);
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= budget) {
                sum += arr[i];
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MarksAndToys instance = new MarksAndToys();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int finalResult = instance.result(arr, k);
        System.out.println(finalResult);
    }

}

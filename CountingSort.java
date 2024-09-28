import java.util.Scanner;

public class CountingSort {

    public int[] result(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] countArray = new int[100];
        for (int num : arr) {
            countArray[num]++;
        }

        return countArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        CountingSort instance = new CountingSort();
        int[] finalResult = instance.result(arr);

        for (int count : finalResult) {
            System.out.print(count + " ");
        }
        sc.close();
    }
}

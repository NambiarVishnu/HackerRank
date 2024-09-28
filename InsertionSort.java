import java.util.Scanner;

public class InsertionSort {
    public void result(int[] arr) {
        int key = 0;
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                for (int n = 0; n < arr.length; n++) {
                    System.out.print(arr[n] + " ");
                }
                System.out.println(" ");
            }
            arr[j + 1] = key;
        }
        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        InsertionSort instance = new InsertionSort();
        instance.result(arr);

    }
}

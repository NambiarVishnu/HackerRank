import java.util.Scanner;

public class InsertionSort2 {
    public void result(int[] arr) {
        int j, key;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            for (int n = 0; n < arr.length; n++) {
                System.out.print(arr[n] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        InsertionSort2 instance = new InsertionSort2();
        instance.result(arr);

    }
}

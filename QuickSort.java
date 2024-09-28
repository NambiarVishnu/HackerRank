import java.util.Scanner;

public class QuickSort {
    public int[] result(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return arr;
        }

        int lP = lowIndex;
        int rP = highIndex - 1;
        int pivot = arr[highIndex];

        while (lP <= rP) {
            while (lP <= rP && arr[lP] <= pivot) {
                lP++;
            }
            while (lP <= rP && arr[rP] >= pivot) {
                rP--;
            }
            if (lP < rP) {
                swap(arr, lP, rP);
            }
        }

        swap(arr, lP, highIndex);

        result(arr, lowIndex, lP - 1);
        result(arr, lP + 1, highIndex);

        return arr;
    }

    public void swap(int[] arr, int lP, int rP) {
        int temp = arr[lP];
        arr[lP] = arr[rP];
        arr[rP] = temp;
    }

    public static void main(String[] args) {
        QuickSort instance = new QuickSort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] finalResult = instance.result(arr, 0, arr.length - 1);
        for (int i = 0; i < finalResult.length; i++) {
            System.out.print(finalResult[i] + " ");
        }
        sc.close();
    }
}

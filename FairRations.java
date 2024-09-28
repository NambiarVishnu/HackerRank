import java.util.Scanner;

public class FairRations {
    public int result(int[] arr) {
        int count = 0;

        int totalOdd = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                totalOdd++;
            }
        }

        if (totalOdd % 2 != 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i]++;
                count++;

                if (i + 1 < arr.length) {
                    arr[i + 1]++;
                    count++;
                }
            }
        }

        for (int i : arr) {
            if (i % 2 != 0) {
                return -1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        FairRations instance = new FairRations();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int finalResult = instance.result(arr);
        if (finalResult == -1) {
            System.out.println("NO");
        } else {
            System.out.println(finalResult);
        }

        sc.close();
    }
}

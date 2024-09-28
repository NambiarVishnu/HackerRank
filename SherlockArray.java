import java.util.Scanner;

public class SherlockArray {
    public String result(int[] arr) {
        int totalSum = 0;

        for (int value : arr) {
            totalSum += value;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int rightSum = totalSum - leftSum - arr[i];

            if (leftSum == rightSum) {
                return "YES";
            }

            leftSum += arr[i];
        }

        return "NO";
    }

    public static void main(String[] args) {
        SherlockArray instance = new SherlockArray();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for (int j = 0; j < m; j++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            String finalResult = instance.result(arr);
            System.out.println(finalResult);
        }
    }

}

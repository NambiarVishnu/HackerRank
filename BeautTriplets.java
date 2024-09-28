import java.util.Scanner;

public class BeautTriplets {
    public int result(int[] arr, int d) {
        int count = 0;
        int diff = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] == d) {
                    for (int k = j + 1; k < arr.length; k++) {
                        if (arr[k] - arr[j] == d) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BeautTriplets instance = new BeautTriplets();
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int finalResult = instance.result(arr, d);
        System.out.println(finalResult);
    }
}

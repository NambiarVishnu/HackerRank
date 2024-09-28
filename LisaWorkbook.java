import java.util.Scanner;

public class LisaWorkbook {
    public static int result(int[] arr, int k) {
        int special = 0;
        int page = 1;
        int index = 0;
        for (int problemNum : arr) {
            for (int i = 1; i <= problemNum; i++) {
                if (i == page) {
                    special++;
                }

                index++;
                if (index == k) {
                    page++;
                    index = 0;
                }
            }

            if (index != 0) {
                page++;
                index = 0;
            }
        }
        return special;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(result(arr, k));

        sc.close();
    }

}

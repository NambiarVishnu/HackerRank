import java.util.Scanner;

public class circularArray {
    public int[] result(int[] arr, int k, int[] qArr) {
        int l = arr.length;
        k = k % l;

        int[] res = new int[qArr.length];
        for (int i = 0; i < qArr.length; i++) {
            int index = (qArr[i] - k + l) % l;
            res[i] = arr[index];
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] arr = new int[n];
        int qArr[] = new int[q];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < qArr.length; j++) {
            qArr[j] = sc.nextInt();
        }
        circularArray instance = new circularArray();
        int[] finalResult = instance.result(arr, k, qArr);
        for (int value : finalResult) {
            System.out.println(value);
        }
    }

}

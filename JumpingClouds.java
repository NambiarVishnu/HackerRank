import java.util.Scanner;

public class JumpingClouds {
    public int result(int[] arr) {
        int count = 0;
        int i = 0;
        while (i < arr.length - 1) {
            if (i + 2 < arr.length && arr[i + 2] == 0) {
                i += 2;
            } else {
                i += 1;
            }
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        JumpingClouds instance = new JumpingClouds();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int finalResult = instance.result(arr);
        System.out.println(finalResult);

    }
}

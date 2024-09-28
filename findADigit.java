import java.util.Scanner;

public class findADigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == V) {
                System.out.println(i);
                break;
            }
        }
    }

}

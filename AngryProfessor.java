import java.util.Scanner;

public class AngryProfessor {
    public String result(int[] arr, int k) {
        int students = 0;
        for (int i = 0; i < arr.length; i++) {
            // students += arr[i];
            if (arr[i] <= 0) {
                students++;
            }
        }
        return (students < k) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AngryProfessor instance = new AngryProfessor();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[m];

            for (int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();
            }

            String finalResult = instance.result(arr, k);
            System.out.println(finalResult);
        }

    }
}

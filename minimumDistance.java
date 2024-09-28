
//F
import java.util.Scanner;

public class minimumDistance {
    public int minimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        int minDistance = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    minDistance = Math.abs(j - i);
                    if (minDistance < min) {
                        min = minDistance;
                    }
                }

            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        minimumDistance InstanceMinimum = new minimumDistance();
        int finalResult = InstanceMinimum.minimum(arr);
        System.out.println(finalResult);
    }

}

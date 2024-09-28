import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSort {
    public String[] result(String[] arr) {
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() != s2.length()) {
                    return Integer.compare(s1.length(), s2.length());
                }
                return s1.compareTo(s2);
            }
        });
        return arr;
    }

    public static void main(String[] args) {
        BigSort instance = new BigSort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        String[] finalResult = instance.result(arr);
        for (String s : finalResult) {
            System.out.println(s);
        }
        sc.close();
    }
}

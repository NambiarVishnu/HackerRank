import java.util.ArrayList;
import java.util.Scanner;

public class SherlockBeast {
    public String result(int m) {
        int count5 = m; // Start with all digits as 5
        while (count5 % 3 != 0) { // Decrease count5 until it's divisible by 3
            count5 -= 5; // We remove 5 to try and make the number valid
        }

        // If count5 becomes negative, no decent number can be formed
        if (count5 < 0) {
            return "-1";
        }

        int count3 = m - count5; // The remaining digits will be 3's

        // Now count5 should be divisible by 3 and count3 should be divisible by 5
        // Construct the decent number
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count5; i++) {
            result.append('5');
        }
        for (int i = 0; i < count3; i++) {
            result.append('3');
        }
        return result.toString();
    }

    public static void main(String[] args) {
        SherlockBeast instance = new SherlockBeast();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            String finalResult = instance.result(m);
            System.out.println(finalResult);
        }
        sc.close();
    }

}

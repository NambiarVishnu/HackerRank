// import java.math.BigDecimal;
// import java.util.Scanner;

// public class MinMax {
//     public BigDecimal[] result(BigDecimal arr[]) {
//         // Initialize min and max to null so we can use them to compare later
//         BigDecimal min = null;
//         BigDecimal max = null;

//         // Calculate the total sum using BigDecimal
//         BigDecimal sum = BigDecimal.ZERO;
//         for (BigDecimal value : arr) {
//             sum = sum.add(value);
//         }

//         // Calculate min and max sum of n-1 elements
//         for (BigDecimal value : arr) {
//             BigDecimal currSum = sum.subtract(value);

//             // Update min and max values
//             if (min == null || currSum.compareTo(min) < 0) {
//                 min = currSum;
//             }
//             if (max == null || currSum.compareTo(max) > 0) {
//                 max = currSum;
//             }
//         }

//         return new BigDecimal[] { min, max };
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         BigDecimal arr[] = new BigDecimal[n];

//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextBigDecimal();
//         }

//         MinMax arrSumInstance = new MinMax();
//         BigDecimal[] finalResult = arrSumInstance.result(arr);
//         System.out.println(finalResult[0] + " " + finalResult[1]);
//     }
// }
//F
import java.util.Scanner;

public class MinMax {
    public long[] result(long arr[]) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        long sum = 0;
        for (long value : arr) {
            sum += value;
        }

        for (long value : arr) {
            long currSum = sum - value;

            if (currSum < min) {
                min = currSum;
            }
            if (currSum > max) {
                max = currSum;
            }
        }

        return new long[] { min, max };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        long arr[] = new long[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextLong();
        }

        MinMax arrSumInstance = new MinMax();
        long[] finalResult = arrSumInstance.result(arr);
        System.out.println(finalResult[0] + " " + finalResult[1]);
    }
}

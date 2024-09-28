// import java.util.Scanner;

// public class SumXor {
//     public int result(int n) {

//         int count = 0;
//         if (n < 0) {
//             return 0; 
//         }
//         if (n == 0) {
//             return 1;
//         }
//         for (int i = 0; i <= n; i++) {
//             int sum = n + i;
//             int xor = n ^ i;
//             if (sum == xor) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         SumXor instance = new SumXor();
//         int finalResult = instance.result(n);
//         System.out.println(finalResult);

//     }

// }
import java.util.Scanner;

public class SumXor {
    public long result(int n) {
        long countZeros = 0;

        while (n > 0) {
            if (n % 2 == 0) {
                countZeros++;
            }
            n /= 2;
        }
        return (long) Math.pow(2, countZeros);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        SumXor instance = new SumXor();
        long finalResult = instance.result(n);
        System.out.println(finalResult);
    }
}

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Scanner;

// public class GamingArray {
//     public String result(ArrayList<Integer> arr) {
//         // Scanner sc = new Scanner(System.in);
//         String A = "BOB";
//         String B = "ANDY";
//         int moves = 0;

//         while (!arr.isEmpty()) {
//             int max = Collections.max(arr);
//             // int maxIndex = arr.indexOf(max);
//             arr.subList(arr.indexOf(max), arr.size()).clear();
//             moves++;
//             // for (int i = arr.size() - 1; i >= maxIndex; i--) {
//             // arr.remove(i);
//             // }

//             // moves++;
//         }

//         return (moves % 2 == 1) ? A : B;

//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         GamingArray instance = new GamingArray();

//         while (n-- > 0) {
//             int m = sc.nextInt();
//             ArrayList<Integer> firstArr = new ArrayList<>(m);

//             for (int i = 0; i < m; i++) {
//                 firstArr.add(sc.nextInt());
//             }

//             String finalResult = instance.result(firstArr);
//             System.out.println(finalResult);
//         }
//         sc.close();

//     }

// }

import java.util.Scanner;

public class GamingArray {
    public static String gamingArray(int[] arr) {
        int moves = 0;
        int max = -1;
        for (int value : arr) {
            if (value > max) {
                moves++;
                max = value;
            }
        }
        return (moves % 2 == 1) ? "BOB" : "ANDY";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int[] arr = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();
            }
            String result = gamingArray(arr);
            System.out.println(result);
        }
        sc.close();
    }
}

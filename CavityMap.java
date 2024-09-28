import java.util.Scanner;

public class CavityMap {
    public String[] result(String[] arr) {
        int n = arr.length;
        String[] reArr = new String[n];

        for (int i = 0; i < n; i++) {
            reArr[i] = arr[i];
        }

        char newChar = 'X';

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < reArr[i].length() - 1; j++) {
                if (arr[i].charAt(j) > arr[i - 1].charAt(j) &&
                        arr[i].charAt(j) > arr[i + 1].charAt(j) &&
                        arr[i].charAt(j) > arr[i].charAt(j - 1) &&
                        arr[i].charAt(j) > arr[i].charAt(j + 1)) {
                    reArr[i] = reArr[i].substring(0, j) + newChar + reArr[i].substring(j + 1);
                }
            }
        }

        return reArr;
    }

    public static void main(String[] args) {
        CavityMap instance = new CavityMap();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        String[] finalResult = instance.result(arr);
        for (String res : finalResult) {
            System.out.println(res);
        }

        sc.close();
    }
}

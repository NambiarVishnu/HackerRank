import java.util.HashSet;
import java.util.Scanner;

public class Gemstones {
    public int result(String[] arr) {
        HashSet<Character> gemSet = new HashSet<>();
        for (char c : arr[0].toCharArray()) {
            gemSet.add(c);
        }

        for (int i = 1; i < arr.length; i++) {
            HashSet<Character> curSet = new HashSet<>();

            for (char c : arr[i].toCharArray()) {
                curSet.add(c);
            }
            gemSet.retainAll(curSet);

        }

        return gemSet.size();
    }

    public static void main(String[] args) {
        Gemstones instance = new Gemstones();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        int finalResult = instance.result(arr);
        System.out.println(finalResult);
    }

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class CutSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {

            arr.add(sc.nextInt());
        }

        Collections.sort(arr);

        while (!arr.isEmpty()) {
            System.out.println(arr.size());
            int min = Collections.min(arr);
            for (int i = 0; i < arr.size(); i++) {
                int updatedValue = (arr.get(i) - min);
                arr.set(i, updatedValue);
            }
            arr.removeIf(ar -> ar == 0);

        }

    }

    // while (!arr.isEmpty()) {
    // for (int i = 0; i < arr.size(); i++) {
    // System.out.println(arr.size());
    // if (arr.get(i) < min) {
    // min = arr.get(i);
    // }
    // for (int j = 0; j < arr.size(); j++) {
    // int updatedValue = arr.get(i) - min;
    // arr.set(j, updatedValue);
    // arr.removeIf(0);

    // }

    // }
    // }
}


//F
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LonelyInteger {
    public ArrayList<Integer> result(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int key = array[i];

            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        ArrayList<Integer> uniqueElement = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                uniqueElement.add(key);
            }
        }
        return uniqueElement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        LonelyInteger instance = new LonelyInteger();
        ArrayList<Integer> finalResult = instance.result(arr);
        for (int i = 0; i < finalResult.size(); i++) {
            System.out.print(finalResult.get(i));
        }

    }
}

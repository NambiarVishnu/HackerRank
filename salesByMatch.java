
//F
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class salesByMatch {
    public int pair(int[] socks) {
        HashMap<Integer, Integer> mapSocks = new HashMap<>();
        for (int i = 0; i < socks.length; i++) {
            int sock = socks[i];
            if (mapSocks.containsKey(sock)) {
                mapSocks.put(sock, mapSocks.get(sock) + 1);
            } else {
                mapSocks.put(sock, 1);
            }
        }
        Set<Integer> keys = mapSocks.keySet();
        Iterator<Integer> iterate = keys.iterator();
        int totalPairs = 0;

        while (iterate.hasNext()) {
            Integer key = iterate.next();
            int count = mapSocks.get(key);
            int singlePairs = count / 2;
            totalPairs += singlePairs;
        }
        return totalPairs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        salesByMatch arrInstance = new salesByMatch();
        int result = arrInstance.pair(arr);
        System.out.println(result);
    }
}

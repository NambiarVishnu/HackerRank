import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SherlockValidString {
    public String isValid(String S) {
        // HashSet<Character> set = new HashSet<>();
        // for (int i = 0; i < S.length(); i++) {
        // set.add(S.charAt(i));
        // }
        // int actualSize = Math.abs(S.length() - set.size());
        // return (actualSize > 1) ? "NO" : "YES";
        // }
        // int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }
        HashMap<Integer, Integer> frequencyCountMap = new HashMap<>();
        for (int freq : map.values()) {
            frequencyCountMap.put(freq, frequencyCountMap.getOrDefault(freq, 0) + 1);
        }

        if (frequencyCountMap.size() == 1) {

            return "YES";
        } else if (frequencyCountMap.size() == 2) {
            int[] freqs = new int[2];
            int index = 0;
            for (int freq : frequencyCountMap.keySet()) {
                freqs[index++] = freq;
            }

            int freq1 = freqs[0];
            int freq2 = freqs[1];
            int count1 = frequencyCountMap.get(freq1);
            int count2 = frequencyCountMap.get(freq2);

            if ((count1 == 1 && (freq1 - 1 == 0 || freq1 - 1 == freq2)) ||
                    (count2 == 1 && (freq2 - 1 == 0 || freq2 - 1 == freq1))) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        SherlockValidString instance = new SherlockValidString();
        String finalResult = instance.isValid(S);
        System.out.println(finalResult);
    }

}

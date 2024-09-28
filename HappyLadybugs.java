import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HappyLadybugs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextInt();
            String b = sc.next();
            System.out.println(isHappy(b) ? "YES" : "NO");
        }

        sc.close();
    }

    static boolean isHappy(String b) {
        boolean hasEmpty = false;
        boolean hasUnhappy = false;
        Map<Character, Integer> colorCount = new HashMap<>();
        for (int i = 0; i < b.length(); i++) {
            char cell = b.charAt(i);
            if (cell == '_') {
                hasEmpty = true;
            } else {
                if ((i == 0 || b.charAt(i - 1) != cell) && (i == b.length() - 1 || b.charAt(i + 1) != cell)) {
                    hasUnhappy = true;
                }
                colorCount.put(cell, colorCount.getOrDefault(cell, 0) + 1);
            }
        }

        if (hasUnhappy && !hasEmpty) {
            return false;
        }

        if (hasEmpty) {
            return colorCount.values().stream().allMatch(count -> count > 1);
        }

        return !hasUnhappy;
    }
}

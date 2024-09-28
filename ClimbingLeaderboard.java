import java.util.*;
import java.util.Scanner;

public class ClimbingLeaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        Set<Integer> uniqueScoresSet = new HashSet<>(ranked);
        List<Integer> uniqueRanks = new ArrayList<>(uniqueScoresSet);
        List<Integer> results = new ArrayList<>();
        int uniqueRankSize = uniqueRanks.size();
        int index = uniqueRankSize - 1; 
        for (int score : player) {
            while (index >= 0 && score >= uniqueRanks.get(index)) {
                index--;
            }
            results.add(index + 2);
        }

        return results;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        List<Integer> ranked = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ranked.add(scanner.nextInt());
        }
        
        int m = scanner.nextInt();
        List<Integer> player = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            player.add(scanner.nextInt());
        }
        
        List<Integer> result = climbingLeaderboard(ranked, player);
        for (int rank : result) {
            System.out.println(rank);
        }
        
        scanner.close();
    }
}

}

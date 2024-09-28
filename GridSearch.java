import java.util.Scanner;

    public class GridSearch {
    
    public static String gridSearch(String[] grid, String[] pattern) {
        int R = grid.length;        // Number of rows in the grid
        int C = grid[0].length();   // Number of columns in the grid
        int r = pattern.length;     // Number of rows in the pattern
        int c = pattern[0].length(); // Number of columns in the pattern
        
        // Traverse all possible starting positions
        for (int i = 0; i <= R - r; i++) {
            for (int j = 0; j <= C - c; j++) {
                boolean found = true;
                
                // Check if the pattern matches
                for (int k = 0; k < r; k++) {
                    if (!grid[i + k].substring(j, j + c).equals(pattern[k])) {
                        found = false;
                        break;
                    }
                }
                
                if (found) {
                    return "YES";
                }
            }
        }
        
        return "NO";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int R = sc.nextInt();
            int C = sc.nextInt();
            String[] grid = new String[R];
            
            for (int i = 0; i < R; i++) {
                grid[i] = sc.next();
            }
            
            int r = sc.nextInt();
            int c = sc.nextInt();
            String[] pattern = new String[r];
            
            for (int i = 0; i < r; i++) {
                pattern[i] = sc.next();
            }
            
            System.out.println(gridSearch(grid, pattern));
        }
        
        sc.close();
    }
}

    
}

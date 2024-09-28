import java.util.Scanner;

public class Encryption {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String msg = sc.next();

        int length = msg.length();
        int row = (int) Math.round(Math.sqrt(length));
        if (row * row > length) {
            row--;
        }
        int col;
        if (row * row == length) {
            col = row;
        } else if (row * (row + 1) >= length) {
            col = row + 1;
        } else {
            row++;
            col = row;
        }

        char[][] grid = new char[row][col];
        int r = 0;
        int c = 0;
        for (int i = 0; i < length; i++) {
            grid[r][c] = msg.charAt(i);

            c++;
            if (c == col) {
                r++;
                c = 0;
            }
        }

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if (grid[j][i] != 0) {
                    str.append(grid[j][i]);
                }
            }
            str.append(" ");
        }
        System.out.println(str);

        sc.close();
    }
}

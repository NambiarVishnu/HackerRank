import java.util.Scanner;

public class SherlockSquares {
    public int result(int m, int z) {
        int count = 0;
        int i = 1;
        while (i <= z) {
            int square = i * i;
            if (square >= m && square <= z) {
                count++;
            } else if (square > z) {
                break;
            }
            i++;

        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SherlockSquares instance = new SherlockSquares();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int z = sc.nextInt();
            int finalResult = instance.result(m, z);
            System.out.println(finalResult);
        }

    }

}

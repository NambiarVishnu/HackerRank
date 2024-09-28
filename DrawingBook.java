import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        int frontTurns = p / 2;
        int backTurns = (n / 2) - (p / 2);
        int result = Math.min(frontTurns, backTurns);
        System.out.println(result);

    }
}

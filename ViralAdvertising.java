import java.util.Scanner;

public class ViralAdvertising {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 5;
        int liked = 2;
        int cumilative = 2;
        for (int i = 1; i < n; i++) {
            x = (x / 2) * 3;
            liked = (x / 2);
            cumilative += liked;
        }
        System.out.println(cumilative);
    }
}

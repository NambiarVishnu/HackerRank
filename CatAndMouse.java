import java.util.Scanner;

public class CatAndMouse {
    public String position(int x, int y, int z) {
        int a = Math.abs(x - z);
        int b = Math.abs(y - z);

        if (a > b) {
            return "Cat B";
        } else if (b > a) {
            return "Cat A";
        }
        return "Mouse C";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CatAndMouse instance = new CatAndMouse();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            String A = instance.position(x, y, z);
            System.out.println(A);
        }
    }

}

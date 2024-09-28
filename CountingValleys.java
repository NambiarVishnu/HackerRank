import java.util.Scanner;

public class CountingValleys {
    public int result(int steps, String path) {
        int seaLevel = 0;
        int valley = 0;
        boolean inValley = false;
        for (char c : path.toCharArray()) {
            if (c == 'D') {
                seaLevel -= 1;
            } else if (c == 'U') {
                seaLevel += 1;
            }

            if (seaLevel < 0 && !inValley) {
                inValley = true;
            }

            if (seaLevel == 0 && inValley) {
                valley++;
                inValley = false;
            }

        }

        return valley;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String S = sc.nextLine();
        CountingValleys instance = new CountingValleys();
        int finalResult = instance.result(n, S);
        System.out.println(finalResult);
    }
}

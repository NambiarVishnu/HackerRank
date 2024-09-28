import java.util.Scanner;

public class StrangeCounter {
    public long result(long n) {
        long cycleTime = 3;
        long cycleStartTime = 1;
        while (n > cycleStartTime + cycleTime - 1) {
            cycleStartTime += cycleTime;
            cycleTime *= 2;
        }
        return cycleStartTime + cycleTime - n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StrangeCounter instance = new StrangeCounter();
        long finalResult = instance.result(n);
        System.out.println(finalResult);
        sc.close();
    }
}

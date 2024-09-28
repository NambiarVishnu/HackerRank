import java.util.Scanner;

public class SavePrisoner {
    public int result(int m, int sweets, int seatNumber) {
        int lastSeat = (seatNumber - 1 + sweets - 1) % m + 1;
        // while (sweets != 0) {

        // if (seatNumber > m) {
        // seatNumber = m - (m - 1);
        // }

        // sweets--;
        // if (sweets > 0) {
        // seatNumber++;
        // }

        // }
        // return seatNumber > m ? 1 : seatNumber;
        return lastSeat;

    }

    public static void main(String[] args) {
        SavePrisoner instance = new SavePrisoner();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int sweets = sc.nextInt();
            int seatNumber = sc.nextInt();
            int finalResult = instance.result(m, sweets, seatNumber);
            System.out.println(finalResult);

        }

    }
}

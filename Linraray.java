import java.util.Scanner;

public class Linraray {
    public int result(int rD, int rM, int rY, int dD, int dM, int dY) {
        int fine = 0;
        if (rY < dY || (rY == dY && rM < dM) || (rY == dY && rM == dM && rD <= dD)) {
            return 0;
        } else if (rD > dD && rM == dM && rY == dY) {
            int lateDays = rD - dD;
            return 15 * lateDays;
        } else if (rM != dM && rY == dY) {
            int lateMonth = Math.abs(rM - dM);
            fine = 500 * lateMonth;

        } else if (rY != dY) {
            return 10000;
        }

        return fine;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rD = sc.nextInt();
        int rM = sc.nextInt();
        int rY = sc.nextInt();
        int dD = sc.nextInt();
        int dM = sc.nextInt();
        int dY = sc.nextInt();
        Linraray instance = new Linraray();
        int finalResult = instance.result(rD, rM, rY, dD, dM, dY);
        System.out.println(finalResult);

    }

}

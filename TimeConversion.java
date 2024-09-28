import java.util.Scanner;

public class TimeConversion {

    public static String result(String s) {
        String period = s.substring(8, 10);
        int hour = Integer.parseInt(s.substring(0, 2));
        String minutes = s.substring(3, 5);
        String seconds = s.substring(6, 8);

        // Convert hour based on AM/PM
        if (period.equals("AM")) {
            if (hour == 12) {
                hour = 0; // Midnight case
            }
        } else { // PM case
            if (hour != 12) {
                hour += 12; // Convert to 24-hour format
            }
        }

        return String.format("%02d:%s:%s", hour, minutes, seconds);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String inputTime = sc.nextLine();

        String convertedTime = result(inputTime);
        System.out.println(convertedTime);

        sc.close();
    }
}
import java.util.Scanner;

public class DayProgrammer {
    public static String result(int year) {
        if (year < 1918) { // Julian calendar
            if (year % 4 == 0) { // Leap year in Julian calendar
                return String.format("12.09.%d", year);
            } else {
                return String.format("13.09.%d", year);
            }
        } else if (year == 1918) { // Transition year
            return "26.09.1918";
        } else { // Gregorian calendar
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) { // Leap year in Gregorian calendar
                return String.format("12.09.%d", year);
            } else {
                return String.format("13.09.%d", year);
            }
        }
    }

    public static void main(String[] args) {
        DayProgrammer instance = new DayProgrammer();
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        String finalResult = instance.result(c);
        System.out.println(finalResult);

    }
}

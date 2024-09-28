import java.util.Scanner;

public class TimeInWords {
    static final String[] DIGIT_WORDS = { "zero", "one", "two", "three",
            "four", "five", "six", "seven", "eight", "nine" };
    static final String[] TEEN_WORDS = { "ten", "eleven", "twelve", "thirteen",
            "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
            "nineteen" };
    static final String[] TEN_WORDS = { null, "ten", "twenty", "thirty",
            "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

    static String result(int number) {
        if (number >= 10 && number < 20) {
            return TEEN_WORDS[number - 10];
        } else if (number < 10) {
            return DIGIT_WORDS[number];
        } else if (number % 10 == 0) {
            return TEN_WORDS[number / 10];
        } else {
            return TEN_WORDS[number / 10] + " " + DIGIT_WORDS[number % 10];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        String time;
        if (M == 0) {
            time = result(H) + " o' clock";
        } else if (M == 1) {
            time = "one minute past " + result(H);
        } else if (M == 15) {
            time = "quarter past " + result(H);
        } else if (M < 30) {
            time = result(M) + " minutes past " + result(H);
        } else if (M == 30) {
            time = "half past " + result(H);
        } else if (M == 45) {
            time = "quarter to " + result(H + 1);
        } else if (M == 59) {
            time = "one minute to " + result(H + 1);
        } else {
            time = result(60 - M) + " minutes to " + result(H + 1);
        }
        System.out.println(time);

        sc.close();
    }
}

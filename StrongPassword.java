import java.util.Scanner;

public class StrongPassword {
    public int result(int n, String password) {
        boolean hasDigit = false;
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasSpecial = false;

        String specialCharacters = "!@#$%^&*()-+";

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (specialCharacters.indexOf(c) >= 0) {
                hasSpecial = true;
            }
        }

        int missing = 0;
        if (!hasDigit)
            missing++;
        if (!hasLower)
            missing++;
        if (!hasUpper)
            missing++;
        if (!hasSpecial)
            missing++;

        int lNeeded = Math.max(0, 6 - n);

        return Math.max(missing, lNeeded);
    }

    public static void main(String[] args) {
        StrongPassword instance = new StrongPassword();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String password = sc.nextLine();
        int finalResult = instance.result(n, password);
        System.out.println(finalResult);

        sc.close();
    }
}

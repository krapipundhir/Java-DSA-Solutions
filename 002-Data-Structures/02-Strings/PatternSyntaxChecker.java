import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static boolean isValidRegex(String pattern) {
        if (pattern == null || pattern.trim().isEmpty()) {
            return false;
        }
        try {
            Pattern.compile(pattern);
            return true;

        } catch (PatternSyntaxException e) {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {

            String pattern = in.nextLine();
            if (isValidRegex(pattern)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

            testCases--;

        }
        in.close();
    }
}

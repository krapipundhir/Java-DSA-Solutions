// A Small example of String formtting in Java By using Printf().

import java.util.Scanner;

public class StrFormatQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // %-15 : It align the String in the 15 character width.
            // %03d : It will print the Integer exactly in 3 Digits if it becomes shorter
            // then,
            // it will add '0' before it.
            // %n : It's for to reach on new line.
            System.out.printf("%-15s%03d%n", s1, x);
        }

        System.out.println("================================");

    }
}

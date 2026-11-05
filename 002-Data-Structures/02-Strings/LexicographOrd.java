// On the basis of ASCII/ Unicode Standard, We will compare the Lexicographical order of Strings.

import java.util.Scanner;

public class LexicographOrd {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        for (int i = 0; i <= s.length() - k; i++) {
            String piece = s.substring(i, i + k);
            if (piece.compareTo(largest) > 0) {
                largest = piece;
            }
            if (piece.compareTo(smallest) < 0) {
                smallest = piece;
            }

        }

        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        System.out.println(getSmallestAndLargest(s, k));
    }

}

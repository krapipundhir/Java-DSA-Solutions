
// "Implemented Consective duplicate word removal using basic logic for fundamental understanding. 
// Also work on Punctutation and special characters. This is the basic implementation of the problem statement.
import java.util.Scanner;

public class ReplaceConsecutive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n > 0) {

            String s = sc.nextLine().trim();
            if (s.isEmpty()) {
                System.out.println("");
                n--;
                continue;
            }
            String array[] = s.split("[^a-zA-Z]+");
            StringBuilder result = new StringBuilder();
            if (array.length > 0) {
                result.append(array[0]);
                for (int i = 1; i < array.length; i++) {

                    if (!array[i].equalsIgnoreCase(array[i - 1])) {
                        result.append(" " + array[i]);
                    }
                }
            }

            System.out.println(result.toString());
            n--;

        }

    }

}

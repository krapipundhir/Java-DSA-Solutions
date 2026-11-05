/**
 * Program Purpose: Find the first and last occurrence of a given character
 * in a string using recursion.
 *
 * Example:
 * Input: str = "abcaabca", element = 'a'
 * Output:
 * First Occurrence: 0
 * Last Occurrence: 7
 *
 * Complexity Analysis:
 * - Time Complexity: O(n), where n is the length of the string
 * (each character is checked once).
 * - Space Complexity: O(n), due to recursive call stack depth.
 *
 * Note: Uses static variables `first` and `last` to track positions
 * across recursive calls.
 */
public class FindFirstNLasOccur {
    
    public static int first = -1;
    public static int last = -1;


    public static void findFirstLast(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
            return;
        }
        char current = str.charAt(idx);
        if (current == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }

        }

        findFirstLast(str, idx + 1, element);
    }

    public static void main(String args[]) {

        String str = "abcaabca";
        findFirstLast(str, 0, 'a');

    }
}

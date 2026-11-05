// A Progarm to print the reverse String by using Two-pointer method- Swapping,
// Because it works faster than on big codes rather than simply by using loop or .reverse method.
// it runs 1/2 time only of length of String thats why it runs fast in Comparison of Other.

public class TwoPointer {
    public static void main(String args[]) {
        StringBuilder str = new StringBuilder("Hello");
        for (int i = 0; i < str.length() / 2; i++) {
            int front = i;
            int back = str.length() - 1 - i; // 5-1-0
            char frontChar = str.charAt(front);
            char backChar = str.charAt(back);
            str.setCharAt(front, backChar);
            str.setCharAt(back, frontChar);

        }
        System.out.println(str);
    }
}

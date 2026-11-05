// Program name: Pallindrome Checker (Two-Pointer Approach)
// Key Feature:
//   -Case Insesitive:

import java.util.Scanner;

public class Pallindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        char array[] = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;
        Boolean isPallindrome = true;
        while (left < right) {
            if (array[left] != array[right]) {
                isPallindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPallindrome) {
            System.out.println(s + " is a Pallindrome.");
        } else {
            System.out.println(s + " is not a Pallindrome.");
        }
        sc.close();

    }
}

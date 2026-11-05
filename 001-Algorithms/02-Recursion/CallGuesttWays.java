/**
 * Program: CallGuesttWays
 * -----------------------------------------
 * 
 * Purpose: Finds the number of ways to invite 'n' guests 
 * Using recursion: where each guest can come alone or pair up.
 * 
 * Logic:
 * - A guest can either come alone OR pair up with another guest.
 * - Base cases:
 *   -> n == 0 : 1 way (no guest)
 *   -> n == 1 : 1 way (single guest)
 * - Recursive relation:
 *   callGuestWays(n) = callGuestWays(n-1) 
 *                      + (n-1) * callGuestWays(n-2)
 * 
 * Example:
 * For n = 4, output = 10 ways.
 * -----------------------------------------
 * Author: Krapi
 * Date: October 2026
 */
public class CallGuesttWays {
    public static int callGuestWays(int n){
        if(n<=1){
            return 1;
        }
        return callGuestWays(n-1) + (n-1)*callGuestWays(n-2);
    }
    public static void main(String[]args){
        int n = 4;
        System.out.println(callGuestWays(n));
    }
}

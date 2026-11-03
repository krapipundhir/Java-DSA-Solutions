/*
 * Program: PlaceTile1xmTomxn


 * Description: Calculates the number of ways to place 1 x m tiles 
 *              on a board of size m x n using recursion.
 * 
 * Approach:
 *   - Base Case 1: If n == m → 2 ways (all vertical or all horizontal).
 *   - Base Case 2: If n < m → 1 way (only horizontal placement possible).
 *   - Recursive Case:
 *       → Vertical placement reduces board length by m.
 *       → Horizontal placement reduces board length by 1.
 *       → Total ways = verticalPlacement + horizontalPlacement.
 * 
 * 
 * Time Complexity: Exponential (due to recursion)
 * Space Complexity: O(n) (recursive stack depth)
 * 
 * Author: Krapi Pundhir
 * Date: October 13, 2026
 */

public class PlaceTile1xmTomxn {
    public static int placeTile(int m, int n){

        if(n == m){
            return 2;
        }
        if(n<m){
            return 1 ;
        }
        int verticalPlacement = placeTile(m, n-m );
        int horizontalPlacement = placeTile(m, n-1);
        return verticalPlacement + horizontalPlacement;
        
    }
    public static void main(String[]args){
        
        int m = 4;
        int n = 4;
        System.out.println(placeTile(m, n));
        
    }
}

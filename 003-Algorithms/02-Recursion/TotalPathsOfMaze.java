/**
 * Program Purpose: Count the total number of unique paths 
 * from the top-left corner (0,0) to the bottom-right corner (n-1,m-1) 
 * in an n x m grid (maze), moving only right or down.
 *
 * Example:
 * For a 3x3 grid:
 * Total Paths = 6
 *
 * Approach:
 * - Use recursion to explore two choices at each cell:
 *   1. Move Down (i+1, j)
 *   2. Move Right (i, j+1)
 * - Base Case:
 *   - If destination is reached → return 1
 *   - If out of bounds → return 0
 *
 * Complexity Analysis:
 * - Time Complexity: O(2^(n+m)) in pure recursion 
 *   (since each step branches into 2 choices).
 * - Space Complexity: O(n+m) due to recursion stack depth.
 *
 * Note: This is the recursive solution. 
 *       Can be optimized using Dynamic Programming (DP).
 */
public class TotalPathsOfMaze {
    public static int CountPaths(int i, int j, int n, int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        if(i==n|| j==m){
            return 0;
        }
        return CountPaths(i+1, j, n, m) + CountPaths(i, j+1, n, m);
    }
    public static void main(String[]args){
        int n = 3, m = 3;
        System.out.println(CountPaths(0, 0, n, m));
    }
}

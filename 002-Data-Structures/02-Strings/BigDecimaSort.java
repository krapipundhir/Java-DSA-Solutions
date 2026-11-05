/**
 * Problem: HackerRank - Java BigDecimal
 * Category: Strings / Mathematics
 * 
 * Description:
 * Given an array of n real number strings, sort them in descending order 
 * based on their numeric values using BigDecimal for precision.
 * 
 * Approach:
 * Used Arrays.sort with a custom Comparator / Lambda expression to compare 
 * elements by converting string values into BigDecimal objects.
 */

import java.math.BigDecimal;
import java.util.*;
class BigDecimaSort{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s,0,n, (s1, s2)->{
        BigDecimal a=new BigDecimal(s1);
        BigDecimal b=new BigDecimal(s2);
        return b.compareTo(a);
        });
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}

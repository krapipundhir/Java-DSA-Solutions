//  ** TryCatch.java
//  * Demonstrates basic exception handling in Java.
//  * Reads two integers, performs division, and
//  * handles invalid input or divide-by-zero errors.
//  */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;


public class TryCatch {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        try{
            int a =sc.nextInt();
            int b=sc.nextInt();
            int result=a/b;
            System.out.println(result);
        }
        catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
            
        
        
    }
}
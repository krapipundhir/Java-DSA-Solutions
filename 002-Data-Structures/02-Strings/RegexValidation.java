// >  Title: Java Valid Username Regular Expression
//  *       Description: Validates whether a given username complies with specific constraints:
//  *              1. Length must be between 8 and 30 characters (inclusive).
//  *              2. Must start with an alphabetic character (a-z or A-Z).
//  *              3. Can only contain alphanumeric characters and underscores [a-zA-Z0-9_].
//  *

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class RegexValidation {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
        while(n-->0){
            String userName = sc.nextLine();
            if(userName.matches(regex)){
                System.out.println("Valid");
            }
            else{
                System.out.println("Invalid");
            }
        }sc.close();
    }
}
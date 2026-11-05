// Key Program: Anagram Checker(Two-Pointer Method)
// Key Feature of it : Case Insensitive
// package 06-Strings;

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()!=b.length()){
           System.out.println("No It is not a Anagram.");
           return;
        }
        char arrayA[]=a.toCharArray();
        char arrayB[]=b.toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        if(Arrays.equals(arrayA,arrayB)){
            System.out.println("Yes, It is a Anagram.");
        }
        else{
            System.out.println("NO, It is not a Anagram.");

        }
    }
}

//  * Project: Java Practice / HackerRank Solutions
//  * File: TagContentExtractor.java
//  * Description: Extracts valid text content enclosed between matching HTML/XML tags
//  * using Java Regular Expressions (Regex) and Pattern/Matcher classes.
//  * Author: [Krapi Pundhir]
 
import java.util.*;
import java.util.regex.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlTagExtractor {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int testCases=sc.nextInt();
    sc.nextLine();
    String regex = "<(.+?)>([^<]+)</\\1>";
    Pattern pattern=Pattern.compile(regex);
    while(testCases>0){
        String input=sc.nextLine();
        Matcher matcher=pattern.matcher(input);
        boolean found=false;
        while(matcher.find()){
            System.out.println(matcher.group(2));
            found =true;
        }
        if(!found){
            System.out.println("None");
        }
        testCases--;
    }
    sc.close();

    }
}
 
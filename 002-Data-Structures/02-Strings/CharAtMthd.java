// A Pragram to Concatenate two Strings & use CharAt method to print character at index i.
import java.util.*;

public class CharAtMthd {
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        String firstName="Krapi";
        String lastName="Pundhir";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName.length());
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }
        
    }
    
}

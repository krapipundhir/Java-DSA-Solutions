import java.io.*;
import java.util.*;

public class StringSplit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if(s.isEmpty()){
            System.out.print(0);
            scan.close();
            return;
        }
        String array[]=s.split("[^a-zA-Z]+");
        System.out.println(array.length);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        
        
        scan.close();
    }
}



    
}

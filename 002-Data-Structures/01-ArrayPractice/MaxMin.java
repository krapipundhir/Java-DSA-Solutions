// Find Max and Min number from the Array of Integer and Print it.

import java.util.*;

public class MaxMin{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size Of Array: ");
        int size=sc.nextInt();
        int marks[]= new int[size];
        
        for(int i=0;i<size;i++){
            System.out.print("Enter your "+ i
             +" index element: ");
            marks[i]=sc.nextInt();
        }
        
        // Integer.MIN_VALUE & Integer.MAX_VALUE is a Predefined Library in 
        // Java that denotes - Positive Infinity and Negative Infinity.

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<size;i++){
            if(marks[i]<min){
                min=marks[i];
            }
            if(marks[i]>max){
                max=marks[i];
            }
        
        }
        System.out.println("Largest num is: "+max);
        System.out.println("Smallest num is: "+min);

    }
    
}

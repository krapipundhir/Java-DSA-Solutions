// Taking an Array of Fruits from the User and size also and print the Index of x fruit.

import java.util.*;

public class PrintIndexOf {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Array Size: ");
        int size=sc.nextInt();
        String fruits[] = new String[size];


        // At the Place of variable in which we have store the size of the array, 
        // we can use (arrayname.length)it also work as the size of array.

        for (int i = 0; i <fruits.length; i++) {
            System.out.println("Enter your Element of Index "+i+": ");
            fruits[i] = sc.next();

        }
        System.out.print("Enter Your Fruit X : ");
        String x=sc.next();
        
        for (int i = 0; i <size; i++){
            if(fruits[i].equals(x)){
                System.out.print("X Found at index: "+ i);
            }
        }
        sc.close();

    }

}

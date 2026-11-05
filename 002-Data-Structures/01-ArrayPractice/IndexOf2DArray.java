// Program to Print a Index 'X' number fron 2D Array,
//  which given as Input from the User.
import java.util.Scanner;

public class IndexOf2DArray {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        int numbers[][]=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        
        
        int  x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(numbers[i][j]==x){
                    System.out.print("X found at Index: "+i+","+j);
                }
            }

        }
      



    }
    
}

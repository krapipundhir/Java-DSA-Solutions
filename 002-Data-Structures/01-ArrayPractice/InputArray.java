// Print Array by taking input from the User.
import java.util.*;
public class InputArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        System.out.print("Enter What u want to print in this Array: ");
        int numbers[] = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter your "+ i +" index element: ");
            numbers[i] = sc.nextInt();

        }
        for(int i = 0; i < size; i++) {

            System.out.println(numbers[i]);
        }

    }

}

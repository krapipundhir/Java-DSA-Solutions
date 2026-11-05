// Input the Array of Numbers from the User and Check It is in ascending order or not.

import java.util.*;

public class CheckAsc {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();

        }
        boolean isascending = true;
        for (int i = 1; i < size; i++) {
            if (numbers[i] < numbers[i - 1]) {

                isascending = false;
                break;

            }

        }
        if (isascending) {
            System.out.println("Yes this Array is in Ascending Order.");
        }

        else {
            System.out.println("No, this Array is not in Ascending Order.");
        }

        // sc.close;

    }

}
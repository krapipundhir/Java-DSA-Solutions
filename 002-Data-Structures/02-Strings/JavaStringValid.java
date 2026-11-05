// Project: Java String Validation
// Problem: Validate an IP address using Regex.
// Author: [Krapi Pundhir]
// Description: Checks whether a given string is avalid IPv4 address.
//     (Validates 4 Octets in the range 0 to 255)

import java.util.Scanner;

class JavaStringValid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String num = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
        String pattern = "^" + num + "\\." + num + "\\." + num + "\\." + num + "$";
        while (sc.hasNext()) {
            String IP = sc.next();
            System.out.println(IP.matches(pattern));

        }
        sc.close();
    }
} 

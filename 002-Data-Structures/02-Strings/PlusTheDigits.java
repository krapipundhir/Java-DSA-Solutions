import java.util.Scanner;
/**
 * Problem: LeetCode 258 (Easy)- Add Digits
 * Approach: First String Conversion & then Character Array conversion & Iteration (Simulation).
 * 
 * Description:
 * Given an integer num, repeatedly add all its digits until the result 
 * has only one digit in the last using the Loop, and return it.
 * While it can be solve by using the Digital Root formula, we have used this method for understanding & learning.
 */

class PlusTheDigits {
    public int addDigits(int num) {
        if(num==0)return 0;
        if(num<10)return num;
        String str=Integer.toString(num);
        while(str.length()>1){
            int res =0;
            char [] arr =str.toCharArray();
            for(int i=0;i<arr.length;i++){
                // arr[i]-'0';  It will Convert the 'char' into int.
                res+=arr[i]-'0';
            }
            str = Integer.toString(res);
        }        
    return Integer.parseInt(str);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PlusTheDigits object = new PlusTheDigits();
        System.out.println(object.addDigits(num));
    }
}
        
     
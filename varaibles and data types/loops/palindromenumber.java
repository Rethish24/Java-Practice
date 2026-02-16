
/*Palindrome Checker
Given a number N, you need to check whether the given number is Palindrome or not. A number is said to be Palindrome when it reads the same from backwards as forward.

//Note: Input number will not have any trailing zeros.

Input
The line inputs N.

Output
You need to print "true" if the number is palindrome otherwise "false" (without quotes). */
package loops;

import java.util.Scanner;

public class palindromenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int rev=0;
        int temp=N;
        int d;
        while(temp>0)
        {
            d=temp%10;
            rev=(rev*10)+d;
            temp=temp/10;

        }
        if(N==rev)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        //Write your code here and print the required output
    }
    
}

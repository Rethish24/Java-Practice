
/*Reverse digits of a Number
Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.

For example, if the input is 12345, the output should be 54321.

Note: Input number will not have any trailing zeros.

Input Format
The first line of input contains the integer n. */
package loops;

import java.util.Scanner;

public class reverse_the_number
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
		//Write your code here
        int rev=0;
        while(n>0)
        {
            int dig = n%10;
            rev=(rev*10)+dig;
            n=n/10;
        }
        System.out.println(rev);
    }
}

package loops;

import java.util.Scanner;

/*Print Digits
Given the number n, print its digits starting from most significant digit to least significant digit.

Input Format
Input consists of single line which has the integer n.

Output Format
print the digits of number one line at a time. */
public class printdigits
 {
       public static void main(String[] args) {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        int count=0;
        while(n>0)
        {   
            count++;
            int d=n%10;
            rev =(rev*10)+d;
            n=n/10;
        }
        int i=1;
        while(i<=count)
        {
            int p=rev%10;
            System.out.println(p);
            rev=rev/10;
            i++;
        }
        
    }




}

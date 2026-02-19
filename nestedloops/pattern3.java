package nestedloops;

import java.util.Scanner;
/*
Print Number Pattern 3
You are given n the number of row of the pattern you have to print.

Input Format
The first line of input contains n the number of rows in the pattern.

Output Format
For each n, print the following pattern.

Example 1
Input

5
Output

0
1 1
2 3 5
8 13 21 34
55 89 144 233 377 
 */
public class pattern3 
{
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
              System.out.print(a+" ");
              int temp =b;
              b=a+b;
              a=temp;
            }
            System.out.println();
        }

        //Write your code here and print the required output

    }
}

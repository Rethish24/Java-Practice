package loops;
/*
HCF of two Numbers
Given two number a and b, find their HCF.

What Is HCF?

HCF or Highest Common Factor is the greatest common divisor between two numbers.

Input Format
The first line of input contains the integers a and b.
*/
import java.util.Scanner;

public class HCF 
{
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int n=0;
        int hcf=0;
        if(a<b)
        {
         n=a;
        }
        else
        {
            n=b;
        }
        for(int i=1;i<=n;i++)
        {
          if(a%i==0 && b%i==0)
          {
             hcf=i;
          }
        }
        // your code here
        System.out.println(hcf);
    } 


}

package Recursion_2D;

import java.util.Scanner;

public class palindrome 
{
static boolean isPalindrome(String str,int si,int ei)
    {
        // Write your code here
        if(si>=ei)
        {
            return true;
        }
        if(str.charAt(si)!=str.charAt(ei))
        {
            return false;
        }
        boolean res=isPalindrome(str,si+1,ei-1);
        return res;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        boolean result=isPalindrome(str,0,str.length()-1);
        if(result)
            System.out.print("YES");
        else
            System.out.print("NO");
    }    
}

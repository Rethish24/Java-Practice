package Strings;

import java.util.Scanner;

public class palindrome 
{
  static int isPalindrome(String str)
      {
              //write code here
              str=str.toLowerCase();
              int n=str.length();
              int l=0;
              int r=n-1;
              while(l<r)
              {
                if(!(str.charAt(l)>='a' && str.charAt(l)<='z'))
                {
                   l++;
                   continue;
                }
                if(!(str.charAt(r)>='a' && str.charAt(r)<='z'))
                {
                   r--;
                   continue;
                }
                if(l<r && str.charAt(l)!=str.charAt(r))
                {
                    return 0;
                }
                l++;
                r--;
                
              }
              return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int result = isPalindrome(str);
        System.out.println(result);        
    }  
}

package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class all_distinct_palindromic_substrings 
{
  static boolean isPalindrome(String str)
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
                    return false;
                }
                l++;
                r--;
                
              }
              return true;
    }
    static void palindromeSubStrs(String s) 
    {
        //Write your code here
        int n=s.length();
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {   String str ="";
            for(int j=i;j<n;j++)
            {
                    str=str+s.charAt(j);
                    
                    if(isPalindrome(str))
                    {
                        if((res.contains(str))==false)
                        {
                            res.add(str);
                        }
                    }
            }
        }
        Collections.sort(res);
        for(int i=0;i<res.size();i++)
        {
            System.out.println(res.get(i));
        } 

    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        palindromeSubStrs(s);
    }  
}

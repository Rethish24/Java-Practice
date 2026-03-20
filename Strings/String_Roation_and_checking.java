package Strings;

import java.util.Scanner;

public class String_Roation_and_checking 
{
class Solution {
    static int isCyclicRotation(String p, String q) 
    {
        // Write your code here
         int result=0;
        if(p.equals(q))
        {
          result=1;
        }
        else
        {
        /*int n=p.length();
        StringBuilder s = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            s.append(p.charAt(i));
        }
        for(int i=0;i<n;i++)
        {   
            char c =s.charAt(n-1);
            String temp = s.substring(0,n-1);
            s.setLength(0);
            s.append(c+"");
            s.append(temp);
            String check=s.toString(); 
            if(check.equals(q))
            {
                result=1;
                break;
            }
            
        }*/
        String s=p+p;
        if(s.contains(q))
        {
            result=1;
        }
    }
return result;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String p = sc.next();
        String q = sc.next();
        int ans = Solution.isCyclicRotation(p, q);
        System.out.println(ans);
        sc.close();
    }
}    
}

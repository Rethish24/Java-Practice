package Strings;

/*
Input

Knuth-Morris-Pratt
Output

KMP
 */

import java.util.*;

public class Autori{
	static String autori(String str)
    {
        // Your code here
        //str =str.split("-");
        char prev=' ';
        String s="";
        s=s+str.charAt(0);
        int n=str.length();
        for(int i=1;i<n;i++)
        {
           char cur=str.charAt(i);
           if(cur>='A' && cur<='Z' )
           {
                  if(prev=='-')
                  { 
                    s=s+cur;
                  }
             
           }
           prev=cur;  
        }
    return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String result = autori(str);
        System.out.print(result);        
        System.out.println('\n');
        sc.close();
    }
}

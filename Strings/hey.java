package Strings;

import java.util.Scanner;

public class hey 
{
  
       static String hey(String str)
      {
           // Your code here
           int n=str.length();
           String res = new String("");
           for(int i=0;i<n;i++)
           {
            char ch = str.charAt(i);
            if(ch!='e')
            {
               res =res+ch;
            }
            else if(ch=='e')
            {
              res=res+"ee";
            }
           }
           return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String result = hey(str);
        System.out.print(result);        
        System.out.println('\n');
        sc.close();
    }    
}

package Strings;

import java.util.Scanner;

public class pangram 
{
public  static void isPangram(String s)
      {
           // Your code here
           s=s.toLowerCase();
           int [] res =new int[26];
           int n=s.length();
           for(int i=0;i<n;i++)
           {
               char ch=s.charAt(i);
               /*int k=(int)(ch);
               k=k-97;*/
               int k=ch-'a';
               if(ch==' ')
               {
                    continue;
               }
               else
               {
                    res[k]=1;
               }
           }
           int count=0;
           for(int i=0;i<26;i++)
           {
               if(res[i]==1)
               {
                    count++;
               }
               else
               {     
                    System.out.println("not pangram");
                    break;
               }
           }
           if(count==26)
           {
               System.out.println("pangram");
           }
    }
    public static void main(String args[]) {
   Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        isPangram(s);
        
        input.close();
    }    
}

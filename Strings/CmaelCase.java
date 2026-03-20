package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class CmaelCase 
{
   
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      camelCase(s);
      System.out.println(); 
      
    }
  sc.close();
  }

  static void camelCase(String s) 
  {
    // your code here
    int n =s.length();
    ArrayList<Character> res = new ArrayList<>();
    char prev=' ';
    for(int i=0;i<n;i++)
    {
      char cur = s.charAt(i);
      if(cur!='_')
      {   if(prev=='_')
          {
            char sp=Character.toUpperCase(cur);
            res.add(sp);
          }
          else
          {
            res.add(cur);
          }
          
      }
      else if(cur=='_')
      {
        prev=cur;
        continue; 
      }
      prev=cur;
     //System.out.print(res[i]);
    }
    int k=res.size();
    for(int i=0;i<k;i++)
    {
      System.out.print(res.get(i));
    }
  }    
}

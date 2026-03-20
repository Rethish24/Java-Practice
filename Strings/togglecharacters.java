package Strings;

import java.util.*;
public class togglecharacters {
public static void main(String[] args) throws Throwable {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();
    toggleCase(n, str);
  sc.close();
  }

  static void toggleCase(int n, String str) 
  {
    // your code here
    
    char [] conv = new char[n];
    for(int i=0;i<n;i++)
    { 
      char cur=str.charAt(i);
      if(cur>='a'&&cur<='z')
      {
        conv[i]=Character.toUpperCase(cur);
      }
      else if(cur>='A'&&cur<='Z')
      {
        conv[i]=Character.toLowerCase(cur);
      }
      else
      {
        conv[i]=cur;
      }
      System.out.print(conv[i]);
    }
  }
}

package StringBuilder;

import java.io.*;
import java.util.*;
public class ASCII_String{
  
  public static String solution(String str) 
  {
      StringBuilder s = new StringBuilder();
      int m=str.length();
      for(int i=0;i<m-1;i++)
      {
        char c=str.charAt(i);
        char n=str.charAt(i+1);
        int k=n-c;
        s.append(c);
        s.append(k);
        //a1
        //a1b3
        //a1b3e-2
        //a1b3e-2
      } 
      s.append(str.charAt(m-1));  
      return s.toString();
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(solution(str));
  }
}
package Strings;

import java.util.Scanner;

public class camel_case_word_separato 
{
  public static void solution(String str) 
  {
    int n=str.length();
    String s="";
    s=s+str.charAt(0);
    for(int i=1;i<n;i++)
    {
      if(str.charAt(i)>='A'&& str.charAt(i)<='Z')
      {
        System.out.println(s);
        s="";
        s=s+str.charAt(i);
      }
      else
      {
        s=s+str.charAt(i);
      }
    }
  System.out.println(s);
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    solution(str);
  }   
}

package Strings;

import java.util.Scanner;

public class counting_the_words 
{
   
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    String p = sc.nextLine();
    while (t > 0) {
      String s = sc.nextLine();
      System.out.println(countWords(s));
      t--;
    }
  }

  public static int countWords(String s) 
  {
    // your code here
    int n=s.length();
    char prev =' ';
    int count =0;
    int i=0;
    for(i=0;i<n;i++)
    {
      char cur=s.charAt(i);
      if(cur==' '&& prev!=' ')
      {
        count++;
      }
      else  if(i==n-1 && s.charAt(i)!=' ')
    {
      count++;
    }
      prev=cur;
    }
  
  return count;
  } 
}

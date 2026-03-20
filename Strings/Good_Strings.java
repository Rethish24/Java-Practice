package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class Good_Strings 
{
static int goodStrings(String s, String[] A, int n) 
  {
    // your code here
    ArrayList<Character> res =new ArrayList<>();
    int k=s.length();
    for(int i=0;i<k;i++)
    {
       res.add(s.charAt(i));
    }
    int ecount=0;
    for(int i=0;i<n;i++)
    {
      int icount=0;
      String s1=A[i];
      int m=s1.length();
      for(int j=0;j<m;j++)
      {
        if(res.contains(s1.charAt(j)))
        {
          icount++;
        }
      }
      if(icount==m)
      {
        ecount++;
      }
    }
    return ecount;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String s = sc.next();
      int n = sc.nextInt();
      String[] A = new String[n];
      for (int i = 0; i < n; i++) {
        A[i] = sc.next();
      }

      System.out.println(goodStrings(s, A, n));
    }
  sc.close();
  }    
}

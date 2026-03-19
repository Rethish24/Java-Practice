package recursion_on_strings_2d_array;

import java.util.Scanner;

public class count_encodings 
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    System.out.println(countEncodings(str,0,""));
  }

  public static int countEncodings(String str,int i,String asf) 
  {
    // your code here
    
    if(i>(str.length()-1))
    {
              System.out.println(asf);
              return 1;
    }
    char d1 =str.charAt(i);
    if(d1=='0')
    {
      return 0;
    }
    int count=0;
    char c1=(char)(((d1-'0')+'a')-1);
    count+=countEncodings(str,i+1,asf+c1);
    if(i+1<str.length())
    {
      char d2=str.charAt(i+1);
      int num =(d1-'0')*10 + (d2-'0');
      if(num<=26)
      {
        char c2 =(char)((num+'a')-1);
        count+=countEncodings(str,i+2,asf+c2);
      }
    }
    return count;

  }    
}

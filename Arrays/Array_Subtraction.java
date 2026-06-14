// Java program to sum two numbers
// represented two arrays.
import java.util.*;

public class Array_Subtraction {

  public static boolean isAlargerthanB(int []a,int []b)
  {
    if(a.length > b.length)
    {
      return true;
    }
    if(b.length > a.length)
    {
      return false;
    }
    if(a.length == b.length)
    {
      for(int i=0;i<a.length;i++)
      {
       if(a[i]>b[i])
       {
        return true;
       }
       if(a[i]<b[i])
       {
        return false;
       }
      }
    }
    return true;
  }
  public static int[] paddwithzeros(int x[],int len)
  {
    int c[]=new int[len];
    int k=len-x.length;
    for(int i=0;i<x.length;i++)
    {
         c[i+k]=x[i];
    }
    return c;
  }
  public static int[]subtraction (int a[],int b[])
  {
      if(b.length<a.length)
      {   
       b=paddwithzeros(b,a.length);
      }
      int c[]= new int[a.length];
      int bor=0;
      for(int i=a.length-1;i>=0;i--)
      {
        int dif=a[i]-b[i]-bor;
        if(dif<0)
        {
          dif+=10;
          bor=1;
        }
        else
        {
          bor=0;
        }
        c[i]=dif;
      }
    int si=0;
    while(si<a.length && c[si]==0)
    {
      si++;
    }
    if(si==a.length) //198-198 =000
    {
      return new int[]{0};
    }
    int ans[]=new int[c.length-si];
    for(int i=si;i<c.length;i++)
    {
      ans[i-si]=c[i];
    } 
    return ans;
  }
  
  public static int[] subtract(int[] n1, int[] n2) 
  {
    // your code here
    boolean flag=isAlargerthanB(n1,n2);
    int c[] ;
    if(flag)
    {
        c=subtraction(n1,n2);
    }
    else
    {
       c=subtraction(n2,n1);
       c[0]=-c[0];
    }
    return c;
  }

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = subtract(arr1, arr2);
    for (int i : res) System.out.println(i);
  }
}

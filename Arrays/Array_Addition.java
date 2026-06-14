import java.util.*;

public class Array_Addition 
{
  public static int[]padwithzeros(int x[],int l)
{
  int k=l-x.length;
  int res[]=new int[l];
  for(int i=0;i<x.length;i++)
  {
    res[i+k]=x[i];
  }
  return res;
}
  static int[] calSum(int a[], int b[], int n, int m)
   {
    // your code here
    if(n>m)
    {
     b=padwithzeros(b,n);
    }
    if(m>n)
    {
      a=padwithzeros(a,m);
    }
     ArrayList<Integer> ans= new ArrayList<>();
     int car=0;
     for(int i=a.length-1;i>=0;i--)
     {
          int sum=a[i]+b[i]+car;
          if(sum>=10)
          {
            sum=sum-10;
            car=1;
          }
          else
          {
            car=0;
          }
       ans.add(sum);
     }
     if(car>=1)
     {
        ans.add(car);
     }
     int res[]= new int[ans.size()];
     for(int i=ans.size()-1;i>=0;i--)
     {
     
      res[i]=ans.get(i);
     }
     return res;
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
    
    int[] res = calSum(arr1, arr2, n1, n2);
    for (int k=res.length-1;k>=0;k--) System.out.println(res[k]);
  }
}

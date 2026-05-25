import java.util.Scanner;

public class buildings 
{
public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    buildings(arr, n);
  }

  public static void buildings(int[] arr, int n) 
  {
    // your code here
    int max =arr[0];
    for(int i=1;i<n;i++)
    {
      if(arr[i]>max)
      {
        max=arr[i];
      }
    }  
    for(int i=0;i<max;i++)
    {
      for(int j=0;j<n;j++)
      {
        if(arr[j]>=max-i)
        {
          System.out.print("*\t");
        }
        else
        {
          System.out.print("\t");
        }
      }
      System.out.println( );
    }
  }    
}

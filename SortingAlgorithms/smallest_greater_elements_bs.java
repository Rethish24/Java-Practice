package SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class smallest_greater_elements_bs 
{
  public static int[] SmallestGreaterElements(int[] arr) 
    {
        // Write your code here'
        int n=arr.length;
        int[] res =new int[n];
        for(int i=0;i<n;i++)
        {
            res[i]=arr[i];
        }
        Arrays.sort(res);
        for(int i=0;i<n;i++)
        { 
          int m=arr[i];
          for(int j=0;j<n;j++)
          { 
            boolean v=false;
            if(res[j]>m)
            {
                arr[i]=res[j];
                v=true;
                break;
            }
            if(j==n-1 && v==false)
            {
                arr[i]=-10000000;
            }
          }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SmallestGreaterElements(arr);
        for(int a : ans) {
            System.out.print(a + " ");
        }  
}
}
package SortingAlgorithms;

import java.util.Scanner;
import java.util.Arrays;

public class MaxOccurance 
{
static int maximum_occurrence(int a[], int n) 
    {
        //Write code here
        Arrays.sort(a);
        int count =1;
        int maxf=1;
        int ans=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]==a[i-1])
            {
                count++;
            }
            else
            {
                if(maxf<count)
                {
                    maxf=count;
                    ans =a[i-1];
                }
                 count =1;
            }
           
        }
        if(maxf<count)
        {
            return a[n-1];
        }
       return ans;  
    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maximum_occurrence(arr, n));

    }    
}

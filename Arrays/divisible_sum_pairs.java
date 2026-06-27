import java.io.*;
import java.util.*;


public class divisible_sum_pairs {

    public static int divisibleSumPairs(int a[], int n, int k)
    {
        // Write code here
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if((a[i]+a[j])%k==0)
                {
                    count++;
                }
             }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        int result = divisibleSumPairs(arr, n, k);
        System.out.print(result);        
        System.out.println('\n');
    }
}

import java.io.*;
import java.util.*;

public class no_of_subarrays_whose_sum_div_by_k {

    public static int subarrayDivisbleByK(int arr[], int n, int k)
    {
        // Write code here 
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int  count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
         sum=sum+arr[i];

         int rem=sum % k;
         
         if(rem<0)
         {
            rem=rem+k;
         }

         if(map.containsKey(rem))
         {
            count=count+map.get(rem);
         }
         map.put(rem,map.getOrDefault(rem,0)+1);
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
        int result = subarrayDivisbleByK(arr, n, k);
        System.out.print(result);        
        System.out.println('\n');
    }
}

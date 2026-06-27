import java.util.*;
public class subarray_sum_divisible_by_k
  {

    public static boolean sumofsubarray(int []nums,int i,int j,int t)
    {
        int sum=0;
        for(int k=i;k<=j;k++)
        {
            sum=sum+nums[k];
        }
        if(sum%t==0)
        {
            return true;
        }
        return false;
    }
    public static int subarrayDivisbleByK(int arr[], int n, int t)
    {
        // Write code here
        int count=0; 
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
               if(sumofsubarray(arr,i,j,t))
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
        int result = subarrayDivisbleByK(arr, n, k);
        System.out.print(result);        
        System.out.println('\n');
    }
  }

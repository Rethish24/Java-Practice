import java.util.Scanner;
public class second_largest_in_array 
{
public static void SecondLargest(int[] arr, int n) 
    {
        // Write code here
     int fmax=nums[0];   //887543
     int smax=0;
     for(int i=1;i<nums.length;i++)
     {
        if(nums[i]==fmax)
        {
            continue;
        }
        else if(nums[i]>fmax)
        {
            smax=fmax;
            fmax=nums[i];
        }
        else if(nums[i]>smax)
        {
            smax=nums[i];
        }
     }
     if(smax==0)
     {
        return -1;
     }
    return smax;
    }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            
        SecondLargest(arr,n);
        sc.close();
        
    }    
}
/*
 int fi=0;
        int si=0;
        if(arr[0]>arr[1])
        {
          fi=arr[0];
          si=arr[1];
        }
        else
        {
          fi=arr[1];
          si=arr[0];
        }
        for(int i=2;i<n;i++)
        {
         if(arr[i]>fi)
         {
          si=fi;
          fi=arr[i];
         }
         else if(arr[i]>si)
         {
              si=arr[i];
         }
        }
        System.out.print(si);
*/

package Arrays;
/*
2nd Largest from array
Given an unsorted array of size N find the 2nd largest element from the array without sorting the array.

Input Format
The first line contains a single integer N.

The second line consists of N integers of the array.

Output Format
Print the second largest number in the new line. */
public class secndlargest 
{
public static void SecondLargest(int[] arr, int n) 
    {
        // Write code here
        int fmax=0;
        int smax=0;
        if(arr[0]>arr[1])
        {
            fmax=arr[0];
            smax=arr[1];
        }
        else
        {
           smax=arr[0];
           fmax=arr[1]; 
        }
        for(int i=2;i<n;i++)
        {
          if(arr[i]>fmax)
          {
            smax=fmax;
            fmax=arr[i];
          }
          else if(arr[i]>smax)
          {
            smax=arr[i];
          }
        }
        System.out.print(smax);
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

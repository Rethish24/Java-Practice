package Arrays;
/*
   You are given an integer array nums of size n where the largest integer is unique.
    Your task is to determine whether the largest element in the array is at least twice as much as every other number in the array.
     If it is, print the index of the largest element, or print -1 otherwise.
 */

import java.util.Scanner;

public class LargestNumberAtLeastTwiceofOthers 
{
      public int LargestElement(int[] arr, int n) 
    {  
        // Write your code here
        int max=0;
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        //System.out.println(max);
        for(int i=0;i<n;i++)
        {
            if(arr[i]==max)
            {
                k=i;
                break;
            }
            
        }
        // System.out.println(k);
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(max>=(2*arr[i]))
            {
                count++;
            }
        }

        if(count==n-1)
        {
            return k;
        }
        else
        {
            return -1;
        }
       
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution Obj = new Solution();
        System.out.println(Obj.LargestElement(nums, n));
    } 
}

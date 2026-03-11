package Recursion;

import java.util.Scanner;

public class Sum_of_array_elements 
{
public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(sumofArrayRec(arr,0 ,n));
    }

	public static int sumofArrayRec(int[] arr,int idx,int n) 
    {
        // write code here
        if(idx>arr.length-1)
        {
            return 0;
        }
        int r=sumofArrayRec(arr,idx+1,n);
        return r+arr[idx];
    }
}    


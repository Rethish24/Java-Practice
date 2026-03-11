package Recursion;

import java.util.Scanner;

public class printing_array_elements 
{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        PrintArray(arr,0,n);
    }

	public static void PrintArray(int[] arr,int idx ,int n) 
    {
      // Write your code here
      if(idx>arr.length-1)
      {
        return;
      }
      System.out.print(arr[idx]+" ");
      PrintArray(arr,idx+1,n);
      //System.out.print(arr[idx]+" ");
    }

}    

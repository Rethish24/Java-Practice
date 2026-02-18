package Arrays;

import java.util.Scanner;

public class arrayoperations 
{
/*Array Operations
Given an array arr of size n, Write a program to find the below 3 values.

Sum of all the elements in the array.

Average of all the elements in the array (Give the floor value).

Maximum element in the array. */  
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();

        ArrayOperations(arr, n);
    }

    public static void ArrayOperations(int[] arr, int n) 
    {
        // Write your code here
        int sum =0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.print(sum+" ");//21
        System.out.print((sum/n)+" ");//21/6=3
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)//1 2 3 4 5 6
            {
                max=arr[i];
            }
        }
System.out.print(max);//6
    }  
}

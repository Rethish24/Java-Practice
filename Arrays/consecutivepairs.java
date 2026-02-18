package Arrays;

import java.util.Scanner;

public class consecutivepairs 
{
  /*
  Karan has an array arr and an integer k. He wants to find out the number of consecutive pairs of array elements whose sum will be k.

Write a program to count the number of consecutive pairs.

Note that, if arr[5]={1,2,3,4,5} then consecutive pairs are (1,2),(2,3),(3,4),(4,5). */    
public static int ArrayProblem(int []arr,int k)
    {
       // Write code here
       int count=0;
       int l =arr.length;
       for(int i=0;i<=l-2;i++)
       {
        if(arr[i]+arr[i+1]==k)
        {
            count++;
        }
       }
       return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
        }
        System.out.println(ArrayProblem(arr,k)); 
    }
}

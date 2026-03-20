package SortingAlgorithms;

import java.util.Scanner;

public class quick_sort 
{
     public static void quickSort(int[] arr)
    {
        //Write code here
        helper(arr,0,arr.length-1);

    }
    public static void helper(int []a,int l,int r)
    {
        if(l>=r)
        {
            return ;
        }
        int Pidx=partition(a,l,r);
        helper(a,l,Pidx-1);
        helper(a,Pidx+1,r);
    } 
    public static int partition(int []a,int l,int r)
    {
        int pivot=a[r];
        int pi=l-1;
        for(int i=l;i<=r;i++)
        {
            if(a[i]<=pivot)
            {
                pi++;
                swap(a,pi,i);
            }
        }
        return pi;
    } 
    public static void swap(int []a,int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
		quickSort(arr);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}

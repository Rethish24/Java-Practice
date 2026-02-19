package Arrays;

import java.util.Scanner;
/*
elements in the array greater than 35
 */
public class countofelements 
{
public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem2(n,arr);
        System.out.println(ans);
    }
    public static int ArrayProblem2(int n, int[] arr)
    {
        // Write code here
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>35)
            {
                count++;
            }
        }
        return count;
    }    
}

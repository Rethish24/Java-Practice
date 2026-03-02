package Strings;

import java.util.ArrayList;
import java.util.Scanner;

public class shufflestring 
{
  
    static void shuffleString(int[] a, String s) 
    {
        // Write your code here and print output in this function
        int n=s.length();
        char [] Arr =new char[n];
        for(int i=0;i<n;i++)
        {
            int k=a[i];
            char ch =s.charAt(i);
            Arr[k]=ch;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(Arr[i]);
        }
    }    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String str = sc.next();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        shuffleString(arr, str);
        sc.close();
    }  
}

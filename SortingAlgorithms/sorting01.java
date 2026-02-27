package SortingAlgorithms;
import java.util.*;
public class sorting01 
{
    static int[] Sorting01(int n,int[] a)
    {
        // Your code here
        int i =0;
        int j=n-1;
        while(i<j)
        {
            while(i<j && a[i]==0)
        {
            i++;
        }
        while(i<j && a[j]==1)
        {
           j--; 
        }
        if(i<j)
        {
            a[i]=0;
            a[j]=1;
            i++;
            j--;
           
        }
         
        }
        return a;
    }
	
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int[] ans=Sorting01(n,arr);
        for(int i=0;i<n;++i){
            System.out.print(ans[i] + " ");
        }
    }
}

import java.util.Scanner;

public class find_indices 
{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x;
        n = sc.nextInt();
        x = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        findX(arr1,0,n, x);
        sc.close();
    }



    static void findX(int arr[],int i,int n, int x)
    {
        // write code here
        if(i>n-1)
        {
            return ;
        }
        if(arr[i]==x)
        {
            System.out.print(i+" ");
        }
        findX(arr,i+1,n,x);
      
    }    
}

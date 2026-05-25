import java.util.*;
public class finding_max 
{
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem1(n,arr);
        System.out.println(ans);
    }

    public static int ArrayProblem1(int n, int[] arr)
    {
        // Write code here
        int max=arr[0];
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                ans=i;
            }
        }
        return ans;

    }
}    


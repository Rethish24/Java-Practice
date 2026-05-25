import java.util.*;

public class finding_sum_avg_max {
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
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int avg=sum/n;
        System.out.print(sum+" "+avg+" "+max);
    }
}
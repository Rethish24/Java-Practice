import java.util.Scanner;

public class min_in_array 
{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
        System.out.println(recforMin(arr, 0));
    }

	public static int recforMin(int[] arr, int idx) 
    {
        //Write your code here
        if(idx>arr.length-1)
        {
            return Integer.MAX_VALUE;
        }
        int r=recforMin(arr,idx+1);
        return Math.min(r,arr[idx]);
    }    
}

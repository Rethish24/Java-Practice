import java.util.Scanner;

public class max_in_array 
{
public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        int result=maxElement(nums,0);
        System.out.print(result);
        sc.close();
    }

    public static int maxElement(int[] arr,int i)
    {
      //Write your code here
      if(i>arr.length-1)
      {
        return Integer.MIN_VALUE;
      }
      int r=maxElement(arr,i+1);
      return Math.max(r,arr[i]);
    }    
}

import java.util.Scanner;

public class sum_of_array_exceptitself 
{
public static int[] SumArrayExpectSelf(int[] nums, int n) 
    {
        //Write code here
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
        }
        for(int i=0;i<n;i++)
        {
            nums[i]=sum-nums[i]; 
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] Ans = SumArrayExpectSelf(nums, n);

        for(int a : Ans)
            System.out.print(a + " ");
    }    
}

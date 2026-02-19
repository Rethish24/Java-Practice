import java.util.Scanner;

public class sumofarrayexceptitself 
{
   /*
   Sum of Array Except Self
Given an array of n integers where n > 1, return an array output such that output[i] is equal to the sum of all the elements of nums except nums[i]. All integers in array are greater than 0.

Input Format
First line consists of an integer n which is the number of elements in array

Next n lines correspond to n elements of array

Output Format
Return the resultant array as asked in question.
    */ 
   public static int[] SumArrayExpectSelf(int[] nums, int n) {
        //Write code here
        int sum =0;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
        }
        int []output = new int[n];
        for(int i=0;i<n;i++)
        {
            output[i]=sum-nums[i];
        }
        return output;
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

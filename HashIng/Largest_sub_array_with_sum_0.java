import java.util.HashMap;
import java.io.*;
import java.util.*;

class Solution 
{
   public int maxLen(int arr[])
   	{
		// Write your code here
		int sum=0;
		int max=0;
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0,-1);
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
	        if(map.containsKey(sum))
			{
				max=Math.max(max,(i-map.get(sum)));
			}
			else
			{
				map.put(sum,i);
			}
		}
		return max;
  	}
}

class Largest_sub_array_with_sum_0 {
	
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
        Solution Obj = new Solution();
		System.out.println(Obj.maxLen(nums));
	}
}

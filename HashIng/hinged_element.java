import java.io.*;
import java.util.*;

class Solution {
    public int findElement(int[] arr, int n) 
	{
        // Write your code here
		int leftmax[]= new int[n];
		leftmax[0]=Integer.MIN_VALUE;
		int lm=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			leftmax[i]=lm;
			lm=Math.max(lm,arr[i]);
		}
		int rightmin[] = new int[n];
		rightmin[n-1]=Integer.MAX_VALUE;
		int rm=Integer.MAX_VALUE;
		for(int i=n-1;i>=0;i--)
		{
			rightmin[i]=rm;
			rm=Math.min(rm,arr[i]);
		}
		if(leftmax[n-1]<arr[n-1])
		{
			return n-1;
		}
		for(int i=1;i<n-1;i++)
		{
			if(leftmax[i]<arr[i] && arr[i]<rightmin[i])
			{
				return i;
			}
		}
     return -1;
    }
}

public class hinged_element {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}

        Solution Obj = new Solution(); 
		System.out.println(Obj.findElement(nums, n));
	}
}

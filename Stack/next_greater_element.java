import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        //Write code here and print
		Stack<Long> st = new Stack<>();
		long res[] = new long[n];
		for(int i=n-1;i>=0;i--)
		{
			while(!st.isEmpty() && st.peek()<=arr[i])
			{
				st.pop();
			}
             if(st.isEmpty())
			 {
				res[i]=-1;
			 }
			 else
			 {
				res[i]=st.peek();
			 }
            st.push(arr[i]);
		}
		return res;
    } 
}
class next_greater_element{
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
	}
}

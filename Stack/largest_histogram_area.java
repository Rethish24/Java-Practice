import java.util.*;
import java.lang.*;
import java.io.*;

class largest_histogram_area {
    
    
	public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[(int)n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        System.out.println(new Solution().maximumArea(arr, n));
	}
}

class Solution {
    public static long maximumArea(long hist[], long m) 
    {
        int n= (int)m;
        int  pse[]= new int [n];
        int nse[]= new int [n];
        Stack<Integer> st = new Stack<>();
        for(int  i=0;i<n;i++)
        {
            while(!st.isEmpty() && hist[st.peek()]>=hist[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                pse[i]=-1;
            }
            else
            {
                pse[i]=st.peek();
            }
            st.push(i);
        }
        st = new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && hist[st.peek()]>=hist[i])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                 nse[i]=n;
            }
            else
            {
                nse[i]=st.peek();
            }
            st.push(i);
        }
         long  max=0;
        for(int i=0;i<n;i++)
        {
            long temp=(nse[i]-pse[i]-1)*hist[i];
            max=Math.max(max,temp);
        }
        return max;
    }
}

import java.util.*;
import java.io.*;
public class previous_greatest_element
{
public static long[] prevGreater(long[] a, int n)
    { 
        //Write code here and print output  
	/*	long [] ans = new long[n];
		for(int i=0;i<n;i++)
		{
			for(int j=i;j>=0;j--)
			{
				if(a[j]>a[i])
				{
					ans[i]=a[j];
					break;
				}
				ans[i]=-1;
			}
			
			
		} 
		return ans; */  

		long ans[] = new long[n];
		Stack<Long> s = new Stack<>();
		for(int i=0;i<n;i++)
		{
			
			while(!s.isEmpty()&& s.peek()<a[i])
			{
				s.pop();
			}
			if(s.isEmpty())
			{
				ans[i]=-1;
			}
			else 
			{
				ans[i]=s.peek();
			}
			s.push(a[i]);
		}  
		return ans;
    } 
}
class Main {
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
			long[] res = previous_greatest_element.prevGreater(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
	}
}
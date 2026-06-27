
  import java.util.*;
class sum_of_odd_len_subarrays{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
			int n=sc.nextInt();
			int []A=new int[n];
			for(int i=0;i<n;i++){
				A[i]=sc.nextInt();
			}
            Solution ob = new Solution();
			System.out.println(ob.oddsubarrsum(A, n));
			t--;
		}
        sc.close();
	}
}
class Solution{
    public long oddsubarrsum(int[] A, int n) 
	{
        //Write code here
		long totalsum=0;
		for(int i=0;i<n;i++)
		{
			long sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum+A[j];
				if((j-i+1)%2!=0)
				{
					totalsum+=sum;
				}
			}
		}
     return totalsum;
    }
}

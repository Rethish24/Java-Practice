
import java.util.Scanner;

public class last_occurance 
{
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = s.nextInt();
		}
		int T = s.nextInt();
		System.out.println(lastIndex(A, T, A.length-1));
	s.close();
	}

	static int lastIndex(int A[],int T,int k)
	{
		//Write your code here
		if(k<0)
		{
			return -1;
		}
		if(A[k]==T)
		{
			return k;
		}
		int r=lastIndex(A,T,k-1);
		return r;
       
	}
}
    

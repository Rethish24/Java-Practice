import java.util.Scanner;

public class first_occurance 
{
static Scanner s = new Scanner(System.in);
	public static int[] takeInput(){
		int N = s.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++){
			A[i] = s.nextInt();
		}
		return A;
	}
	
	public static void main(String[] args) {
		int[] A = takeInput();
		int T = s.nextInt();
		System.out.println(firstIndex(A, T, 0));
		s.close();
	}

	static int firstIndex(int A[],int T,int idx)
	{
		//Write your code here
		if(idx>A.length-1)
		{
			return -1;
		}
		if(A[idx]==T)
		{
			return idx;
		}
		int rec =firstIndex(A,T,idx+1);
		return rec;
       
	}    
}

package Arrays;

import java.util.Scanner;

public class FirstOccurenceIndex 
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
	}

	static int firstIndex(int A[],int T,int startIndex)
	{
		//Write your code here
		int count=0;
		int result=0;
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==T)
			{
			    result =i;
				break;
			}
			else
			{
				count++;
			}
		}
		if(count == A.length)
		{
			return -1;
		}
		else
		{
           return result;
		}
		
       
	}
}

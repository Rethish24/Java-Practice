import java.io.*;
import java.util.*; 

class celebrity{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M[][] = new int[N][N];
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                M[i][j] = sc.nextInt();
        System.out.println(new Solution().findCelebrity(M,N));
    } 
} 
class Solution
{ 
    int findCelebrity(int M[][], int n)
    {
       int i=0;
       int j=n-1;
       while(i<j)
       {
        if(M[i][j]==1)
        {
            i++;
        }
        else
        {
            j--;
        }
       }
       int k=i;
       for(i=0;i<n;i++)
       {
        if(i!=k &&(M[k][i]==1 || M[i][k]==0))
        {
            return -1;
        }
       }
       return k;
    }

}

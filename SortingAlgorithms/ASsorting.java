import java.util.*;
public class ASsorting
{

    public static void sortCol(int[][] mat, int N, int M)
    {
        // Write your code and print here
        int [][]res = new int[M][N];
        res=transpose(mat, N ,M);
        for(int i=0;i<M;i++)
        {
          Arrays.sort(res[i]);
        }
        int [][]matrix=new int[N][M];
        matrix =transpose(res, M, N);
      for(int i=0;i<N;i++)
      {
        for(int j=0;j<M;j++)
        {
          System.out.print(matrix[i][j]+" ");
        }
           System.out.println();
      }
    }
    public static int [][]transpose(int [][]mat,int n,int m)
    {
        int res[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
          for(int j=0;j<n;j++)
          {
            res[i][j]=mat[j][i];
          }
        }
        return res;
    }
}

public class Main {
        public static void main(String[] args) throws Throwable {
         Scanner sc=new Scanner(System.in); 
          int n=sc.nextInt();
          int m=sc.nextInt();
          int[][] mat =new int[n][m]; 
          for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                mat[i][j] = sc.nextInt();
            }
          } 
          Solution.sortCol(mat, n, m);
      
        }
}
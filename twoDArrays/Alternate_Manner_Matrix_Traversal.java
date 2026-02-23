
import java.util.*;
/*
Given a 2D matrix mat of M rows and N columns , the task is to print the 2D matrix in an alternate manner.

Alternate manner denotes that the elements of the odd rows (first row, third row, etc) will be printed from left to right, and the elements of the even rows(second row, fourth row, etc.) will be printed from right to left.

For example, if M=3, then the first line will contain all the elements of the first row of the matrix from left to right. The second line will contain all the elements of the second row from right to left. The third line will contain all the elements of the third row from left to right.
 */
class Solution

{
    public void printElementsAlternately(int[][] mat,int m,int n) {
        //Write code here and print output
        for(int i=0;i<m;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
            else
            {
                for(int j=n-1;j>=0;j--)
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
    }
}

public class Alternate_Manner_Matrix_Traversal  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int m, n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.printElementsAlternately(mat,m,n);
       
        sc.close();
    }
}

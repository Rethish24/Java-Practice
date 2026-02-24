import java.util.*;


class Solution
{
 public int [] spiralMatrix2(int[][]a, int n, int m) 
    {
         // write your code here
         int l =n*m;
         int [] f = new int[l];
         int k=0;
         int left =0;
         int right=m-1;
         int top=0;
         int bottom=n-1;
         while(left<=right && top<=bottom)
         {
            for(int i=top;i<=bottom;i++)
            {
                f[k]=a[i][left];
                k++;
            }
            left++;
            for(int i=left;i<=right;i++)
            {
                f[k]=a[bottom][i];
                k++;
            }
            bottom--;
            if(left<=right)
            {
            for(int i=bottom;i>=top;i--)
            {
                f[k]=a[i][right];
                k++;
            }
            right--;
            }
            if(top<=bottom)
            {
            for(int i=right;i>=left;i--)
            {
               f[k]=a[top][i];
               k++;
            }
            top++;
            }
         }
            return f;
         }


    }

public class spiral2matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] matrix = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int[] result = ob.spiralMatrix2(matrix, n, m);
            for (int i = 0; i <result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }    
}

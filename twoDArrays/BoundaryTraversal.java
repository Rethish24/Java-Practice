import java.util.*;
public   class BoundaryTraversal {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                matrix[i][j] = sc.nextInt();

        boundaryTraversal(n, m, matrix);
        sc.close();
    }

    public static void boundaryTraversal(int n, int m, int[][] a) 
    {
        // your code here
        if(n==1)
    {
for(int j=0;j<m;j++)
        {
             System.out.print(a[0][j]+" ");
        }
    }
    else if(m==1)
    {
for(int i=0;i<n;i++)
        {
             System.out.print(a[i][m-1]+" ");
        }
    }
        else
        {
            // int i=0;
        for(int j=0;j<m;j++)
        {
             System.out.print(a[0][j]+" ");
        }
        // int j=m-1
        for(int i=1;i<n;i++)
        {
             System.out.print(a[i][m-1]+" ");
        }
        // int i=n-1
        for(int j=m-2;j>=0;j--)
        {
          System.out.print(a[n-1][j]+" ");  
        }
        // j=0
        for(int i=n-2;i>=1;i--)
        {
            System.out.print(a[i][0]+" ");
        }
        }

       
    }
}
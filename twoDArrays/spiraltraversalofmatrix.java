import java.util.Scanner;

public class spiraltraversalofmatrix 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int [][]mat=new int[n][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                mat[i][j]=sc.nextInt();
            }
        }

        spirallyTraverse(mat);     
        System.out.println('\n');
    }

    public static void spirallyTraverse(int [][]a) 
    {
       // your code here
       int n =a.length;
       int m =a[0].length;
       int left =0;
       int right=m-1;
       int top=0;
       int bottom=n-1;
       while(left<=right && top<=bottom)
       {
        for(int j=left;j<=right;j++)
        {
            System.out.print(a[top][j]+" ");
        }
        top++;
        for(int i=top;i<=bottom;i++)
        {
            System.out.print(a[i][right]+" ");
        }
        right--;
        if(top<=bottom)
        {
        for(int j=right;j>=left;j--)
        {
            System.out.print(a[bottom][j]+" ");
        }
        bottom--;
        }
        if(left<=right)
        {
        for(int i=bottom;i>=top;i--)
        {
            System.out.print(a[i][left]+" ");
        }
        left++;
       }
       }
         
     
    }
}

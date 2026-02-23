import  java.io.*;
import java.util.*;

class Solution {
    public int[][] rotateBy90(int [][]a) {
        // Your code here
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<j)
                {
                    int temp =a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            int k =0;
            int l=n-1;
            while(k<l)
            {
              int swap =a[i][k];
              a[i][k]=a[i][l];
              a[i][l]=swap;
              k++;
              l--;
            }
        }
    return a;
    
    }
}

public class RotateMatrixby90cw {
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
        Solution Obj = new Solution();
        int[][] ans = Obj.rotateBy90(mat);
        for(int i=0; i<n; i++)
        {   for(int j=0; j<n; j++)
                  {
                       System.out.print(ans[i][j] + " ");
                  } System.out.println("");
        }
        System.out.println('\n');
    }
}
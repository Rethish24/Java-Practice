import java.io.*;
import java.util.*;

public class Chessboardmatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int [][]mat=new int[n][n];
        for(int i=0;i<n;++i){
            for(int j=0;j<n;++j){
                mat[i][j]=sc.nextInt();
            }
        }
        alternateMatrixSum(mat,n);  
        System.out.println('\n');
    }

    public static void alternateMatrixSum(int [][]mat, int n) 
    {
           // your code here
           int bs=0;
           int ws=0;
           for(int i=0;i<n;i++)
           {
            for(int j=0;j<n;j++)
            {
                if(((i+j)%2)==0)
                {
                    bs=bs+mat[i][j];
                }
                else
                {
                    ws=ws+mat[i][j];
                }
            }
           }
           System.out.println(bs);
           System.out.println(ws);


    }
}

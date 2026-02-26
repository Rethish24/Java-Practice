import java.io.IOException;
import java.util.Scanner;

public class specialmatrix 
{
static boolean special(int matrix[][], int n){
         //Write code here
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n;j++)
            {
                if(i==j || i+j==(n-1))
                {
                    if(matrix[i][j]==0)
                    {
                        return false;
                    }
                }
                else
                {
                    if(matrix[i][j]!=0)
                    {
                        return false;
                    }
                }
            }
         }
         return true;
        
    }


    public static void main(String args[])throws IOException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            boolean ans = special(matrix, n);
            System.out.println(ans);
        }
    }    

}
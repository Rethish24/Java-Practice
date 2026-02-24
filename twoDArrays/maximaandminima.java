import java.util.Scanner;

public class maximaandminima 
{
    public static int maximaMinima(int[][] a) 
    {
        //Write code here
        
        int n =a.length;
        for(int i=0;i<n;i++)
        {
            int s=a[i][0];
           // int l=a[i][0];
           int minindex=0;
            for(int j=1;j<n;j++)
            {
                if(a[i][j]<s)
                {
                    s=a[i][j];
                    minindex=j;
                }
            }
             boolean islargeincol=true;
             for(int k=0;k<n;k++)
             {
                if(a[k][minindex]>s)
                {
                    islargeincol =false;
                    break;
                }
               
             }
             if(islargeincol==true)
               {
                return s;
               }
        
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int result = maximaMinima(matrix);
        System.out.println(result);
        sc.close();
    }
}


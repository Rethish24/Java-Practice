package recursion_on_strings_2d_array;
import java.util.Scanner;

public class CountMazePaths {
    static int countMazePath(int sr,int sc,int n, int m,String asf)
    {
        //Write your code here
        if(sr==n && sc==m)
        {
            System.out.println(asf);
            return 1;
        }
        if(sr>n || sc>m)
        {
            return 0;
       }
        int h=countMazePath(sr,sc+1,n,m,asf+"h");
        int v=countMazePath(sr+1,sc,n,m,asf+"v");
        return h+v;


    }
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n;
        n = sc.nextInt();
        m = sc.nextInt();
            System.out.println(countMazePath(1,1,n, m,""));
        }
    }
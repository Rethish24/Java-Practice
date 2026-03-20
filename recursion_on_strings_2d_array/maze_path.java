package recursion_on_strings_2d_array;
import java.util.*;
public class maze_path 
{
        static void countMazePath(int sr,int sc,int n, int m,String asf)
    {
        //Write your code here
        if(sr==n && sc==m)
        {
            System.out.println(asf);
            return ;
        }
        if(sr>n || sc>m)
        {
            return ;
       }
        countMazePath(sr,sc+1,n,m,asf+"h");
        countMazePath(sr+1,sc,n,m,asf+"v");
        


    }
	public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n;
        n = sc.nextInt();
        m = sc.nextInt();
        countMazePath(1,1,n, m,"");
        sc.close();
    }
}

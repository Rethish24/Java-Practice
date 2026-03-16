package recursion_on_strings_2d_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class maze_problem 
{
public static void printMazePaths(int sr, int sc, int dr, int dc, String asf) 
    {
        //Write your code here
        if(sr==dr && sc==dc)
        {
            System.out.println(asf);
            return ;
        }
        if(sr>dr || sc>dc)
        {
            return ;
        }
        for(int jump=1;jump<=dc;jump++)
        {
            printMazePaths(sr,sc+jump,dr,dc,asf+"h"+jump);
        }
        for(int jump=1;jump<=dr;jump++)
        {
            printMazePaths(sr+jump,sc,dr,dc,asf+"v"+jump);
        }
        for(int jump=1;jump<=Math.min(dr,dc);jump++)
        {
            printMazePaths(sr+jump,sc+jump,dr,dc,asf+"d"+jump);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        printMazePaths(0, 0, n - 1, m - 1, "");
    }    
}

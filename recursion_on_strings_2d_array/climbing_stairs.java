package recursion_on_strings_2d_array;
import java.util.Scanner;
class Accio {
    public int ClimbingStairs(int i,int n) 
    {
        // Write your code here
        if(i==n)
        {
            return 1;
        }
        if(i>n)
        {
            return 0;
        }
        int r1=ClimbingStairs(i+1,n);
        int r2=ClimbingStairs(i+2,n);
        return r1+r2;

    }
}

public class climbing_stairs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio Obj = new Accio();
        System.out.println(Obj.ClimbingStairs(0,n));
    }
}
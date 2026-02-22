import java.util.*;

public class OptimusPrime {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=2;i<=n;i++)
        {   boolean isprime=true;
            for(int j=2;j*j<=i;j++)
            {
                if(i%j==0)
               {
                isprime=false;
                break;
               }
            }
            if(isprime)
            {
                System.out.println(i);
            }
        }
        // Your code here
    }
}
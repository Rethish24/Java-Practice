package nestedloops;
/*
Optimus Prime -- Given an integer n, print all prime numbers between 1 and n (both inclusive).
 */
import java.util.Scanner;

public class optimusprime
{
   public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++)
        {   
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                count++;
            }
            if(count==2)
            {
                System.out.println(i);
            }
        }
        
    }    
}

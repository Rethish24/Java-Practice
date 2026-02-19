package nestedloops;
/*
1
21
321
4321
 */
import java.util.Scanner;

public class numberpattern 
{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        // your code here
        
    }
    
}

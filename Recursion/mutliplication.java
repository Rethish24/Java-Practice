
import java.util.Scanner;

public class mutliplication 
{
    
    static int sum=0;
    public static void mul(int n,int m)
    {
        if(m==0)
        {
            System.out.println(sum);
            return;
        }
        sum=sum+n;
        mul(n,m-1);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        mul(n,m);
         sc.close();
     }
    }

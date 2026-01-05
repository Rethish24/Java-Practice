import java.util.*;
public class divisibility_3
{
    public static void main(String args[])
    {
        // i am writing the code for divisibility of 3 
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
        int sum=0;
        int num=n;
        while(n>0)
        {
            sum=sum+n%10;
            n=n/10;
        }
         System.out.println(sum);
        if(sum%3==0)
        {
            System.out.print(num +" is divisible by 3");
        }
        else
        {
           System.out.print(num +" is not divisible by 3");
        }

    }
}
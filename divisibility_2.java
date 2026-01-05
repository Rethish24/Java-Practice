import java.util.*;
public class divisibility_2
{
    public static void main(String args[])
    {
        // i am writing the code for divisibility of 2 
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
        int num=n%10;
        if (num%2==0)
        {
            System.out.print(n+" is divisible by 2");
        }
        else
        {
            System.out.print(n+" is  not divisible by 2");
        }

    }
}
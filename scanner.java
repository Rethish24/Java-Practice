import java.util.*;
// scanner for taking input
public class scanner
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        short  k= sc.nextShort();
        int    x= sc.nextInt();
        long   r= sc.nextLong();
        float  y=sc.nextFloat();
        double s=sc.nextDouble();
        boolean b = sc.nextBoolean();
        //primary job of nextInt/Float,etcc() is to take the input ,then after taking when we [ress enter or spca,next line character apperas it moves to next line ]
        System.out.println(k);
        System.out.println(x);
        System.out.println(r);
        System.out.println(y);
        System.out.println(s);
        System.out.println(b);


    }
}
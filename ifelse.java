import java.util.*;
public class ifelse
 {
public static void main(String []args)
{
    Scanner sc = new Scanner(System.in);
    int age =sc.nextInt();
    if(age>=18 && age<80)
    {
        System.out.println("You are Eligible to drive on roads");
    }
    else
    {
      System.out.println("You are Not  Eligible to drive on roads");
    }
sc.close();
}
    
}

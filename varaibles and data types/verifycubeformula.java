/* Take two positive integers from the user. Verify if (a+b)^3 = a^3 + b^3 + 3a^2b + 3ab^2.

Calculate the Left hand side (LHS) and the right hand side (RHS) of the equation. Print the (LHS) and the (RHS).

Print VERIFIED in uppercase if they are equal, otherwise print NOT VERIFIED. */
import java.util.Scanner;

public class verifycubeformula 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long lhs =(a+b)*(a+b)*(a+b);
        long rhs=(a*a*a)+(b*b*b)+(3*a*a*b)+(3*b*b*a);
        System.out.println(lhs);
        System.out.println(rhs);
        if(lhs==rhs)
        {
            System.out.println("VERIFIED");
        }
        else
        {
           System.out.println("NOT VERIFIED"); 
        }
        sc.close();
        // write code here
    }

}

/*Given the 3 sides of a triangle, find out whether it is acute-angled, right-angled, or obtuse-angled.

You need to output 1 for acute, 2 for right-angled, and 3 for an obtuse-angled triangle. You can assume that the input values always form a triangle and are valid integers.

Note

A triangle is acute-angled, if twice the square of the largest side is less than the sum of squares of all the sides.

A triangle is obtuse-angled, if twice the square of its largest side is greater than the sum of squares of all the sides.

A triangle is right-angled, if twice the square of its largest side is exactly equal to the sum of squares of all the sides. */
import java.util.Scanner;

public class whichangledtraingle 
{
  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int max;
        if(a>b && a>c)
        {
            max=b;
        }
        else if(b>a && b>c)
        {
            max= b;
        }
        else
        {
         max =c;
        }
        if((2*max*max) < (a*a+b*b+c*c))
        {
            System.out.println(1);
        }
        if((2*max*max) > (a*a+b*b+c*c))
        {
            System.out.println(3);
        }
        if((2*max*max) == (a*a+b*b+c*c))
        {
            System.out.println(2);
        }
        //Write your code here
    
	
}

}

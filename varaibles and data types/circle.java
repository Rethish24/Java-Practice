/*Circle Area-Perimeter
You are required to take the radius of a circle as input from the user, and finally, print the area and perimeter of the circle.

Note: Take pi as 3 */
import java.util.Scanner;

public class circle 
{
  public static void main(String[] args) 
    {
        //Write your code here
            Scanner sc = new Scanner(System.in);
           // pi =3 approx taken
            long r =sc.nextInt();
            long area=3*r*r;
            long peri =2*3*r;
            System.out.println(area);
            System.out.println(peri);
    }  
}

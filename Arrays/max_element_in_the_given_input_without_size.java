
import java.util.*;
import java.io.*;

public class max_element_in_the_given_input_without_size {
    public static void main(String args[]) 
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        int max=Integer.MIN_VALUE;
        while(sc.hasNextInt())
        {
         int k=sc.nextInt();
         max=Math.max(max,k);
        }
        System.out.println(max);
    }
}

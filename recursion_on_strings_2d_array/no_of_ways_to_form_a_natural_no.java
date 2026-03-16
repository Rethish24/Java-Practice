package recursion_on_strings_2d_array;

import java.util.Scanner;

public class no_of_ways_to_form_a_natural_no 
{
   
public static long ways(int n, int i)
    {
//Write your code here
    if(n==0)
    {
        return 1;
    }
    if(n<i)
    {
        return 0;
    }
    long ci=ways(n-i,i+1);
    long ce=ways(n,i+1);
    return ci+ce;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(ways(n, 1));
    }

}

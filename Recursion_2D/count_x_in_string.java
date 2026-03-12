package Recursion_2D;

import java.util.Scanner;

public class count_x_in_string 
{
static int countX(String str, int i, int n) 
    {
        //Write your code here
        if(i>str.length()-1)
        {
            return 0;
        }
        int r=countX(str,i+1,n);
        return r+((str.charAt(i)=='x')?1:0);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n=str.length();
        System.out.println(countX(str,0,n));
    }    
}

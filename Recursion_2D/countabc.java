package Recursion_2D;

import java.util.Scanner;

public class countabc
{
    static int CountABC(String str, int i,int n) 
    {
        // Write your code here
        if(i>n-2)
        {
            return 0;
        }
        int r=CountABC(str,i+1,n);
        return r+((str.substring(i,i+3).equals("abc")||str.substring(i,i+3).equals("aba"))?1:0);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(CountABC(s, 0,s.length()-1));

    }
}

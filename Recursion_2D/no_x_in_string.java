package Recursion_2D;

import java.util.Scanner;

public class no_x_in_string 
{
static String noX(String s,int idx,StringBuilder sb) 
    {
        // Write your code here
        if(idx>s.length()-1)
        {
            return sb.toString();
        }
        if(s.charAt(idx)!='x')
        {
            sb.append(s.charAt(idx));
        }
        String res=noX(s,idx+1,sb);
        return res;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        StringBuilder sb =new StringBuilder();
        System.out.println(noX(s,0,sb));
    }    
}

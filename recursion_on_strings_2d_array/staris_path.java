package recursion_on_strings_2d_array;

import java.util.Scanner;



public class staris_path 
{
static void printStairPaths(int n,String s) 
    {
        //Write your code here
        if(n==0)
        {
            System.out.println(s);
            return ;
        }
        if(n<0)
        {
            return ;   
        }
       printStairPaths(n-1,s+"1");
       printStairPaths(n-2,s+"2");
       printStairPaths(n-3,s+"3");
        
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        printStairPaths(n,"");
    }    
}

package StringBuilder;

import java.util.Scanner;

public class StrangeString 
{
   static String strangeString(int n) 
    {
        //Write your code here
        char c='a';
        StringBuilder s = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                s.insert(0,c);  
                c++;   
            }
            else
            {
                 s.append(c);
                 c++;  
            }
            if(c>'z')
            {
                c='a';
            }
            
        }
        return s.toString();
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0){
            int n = input.nextInt();
            System.out.println(strangeString(n));
        }
    } 
}

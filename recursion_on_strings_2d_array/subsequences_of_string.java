package recursion_on_strings_2d_array;
import java.util.Scanner;
public class subsequences_of_string 
{
 static void printSubsequence(String s,String asf,int i)      
{            
                if(i>s.length()-1)         
                 {  System.out.print(asf+" ");            
                    return ;        
                 } 
            printSubsequence(s,asf+s.charAt(i),i+1);         
            printSubsequence(s,asf,i+1);     
   }     
            public static void main(String args[])
             {         Scanner sc = new Scanner(System.in);        
                        String s = sc.nextLine();         
                        printSubsequence(s,"",0);     
                 sc.close();
             }     
}

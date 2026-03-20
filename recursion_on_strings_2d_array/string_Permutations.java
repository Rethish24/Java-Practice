package recursion_on_strings_2d_array;

import java.util.ArrayList;
import java.util.Scanner;

public class string_Permutations 
{
public void printPermutations(String str,String res,ArrayList<String> ans) 
    {

        // write your code here
        if(str.length()==0)
        {
            if(!ans.contains(res))
            {
                ans.add(res);
                System.out.println(res);
            }
            
            return ;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch =str.charAt(i);
            String rem = ((str.substring(0,i))+(str.substring(i+1)));
            printPermutations(rem,res+ch,ans);                                                         
        }

    }


 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        string_Permutations Obj = new string_Permutations();
        ArrayList<String> ans = new ArrayList<>();
        Obj.printPermutations(str,"",ans);
        sc.close();
    }    
}

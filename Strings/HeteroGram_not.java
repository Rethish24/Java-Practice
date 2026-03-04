package Strings;

import java.util.Scanner;

public class HeteroGram_not 
{
public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s=s.toLowerCase();
        int n=s.length();
        String result="Yes";
        int [] alpha = new int [26];
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            int k=c-'a';
            if(alpha[k]==1)
            {
                result="No";
                break;
            }
            alpha[k]=1;
        }
        System.out.println(result);
    }    
}

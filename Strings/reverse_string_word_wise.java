package Strings;

import java.util.*;
public class reverse_string_word_wise {
   
    public static String reverseWords(String str)
    {
        // your code here
        String [] res = str.split(" ");
        StringBuilder s= new StringBuilder();
        int n=res.length;
        for(int i=n-1;i>=0;i--)
        {  
            s.append(res[i]);
            s.append(" ");
        }
        return s.toString();
    } 
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.nextLine();
            System.out.println(reverseWords(s));
            t--;
        }
        sc.close();
    }
}

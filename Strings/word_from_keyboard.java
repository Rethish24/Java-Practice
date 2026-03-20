package Strings;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class word_from_keyboard 
{

    static ArrayList<String> getStrings(ArrayList<String> arr)
    {  
        // write your code here
        ArrayList<String> res = new ArrayList<>();
        String fr="qwertyuiop";
        String sr="asdfghjkl";
        String tr="zxcvbnm";
        int n=arr.size();
        for(int i=0;i<n;i++)
        {
            String s=arr.get(i);
            int m=s.length();
            int frcount=0;
            int srcount=0;
            int trcount=0;
            for(int j=0;j<m;j++)
            {
                char ch =s.charAt(j);
                
                if(fr.contains(ch+""))
            {
                frcount++;
                continue;
            }
            if(sr.contains(ch+""))
            {
                srcount++;
                continue;
            }
            if(tr.contains(ch+""))
            {
                trcount++;
                continue;
            }
            }
            if(frcount==m||srcount==m||trcount==m)
            {
                res.add(s);
            }   
        }
        return res;
    }

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        ArrayList<String> arr = new ArrayList<String>();
        for(int i = 0; i < n; i++){
            String s = sc.next();
            arr.add(s);
        }

        ArrayList<String> result = getStrings(arr);
        for(int i = 0; i < result.size(); i++){
            System.out.println(result.get(i));
        }
        sc.close();
    }
}

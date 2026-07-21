import java.io.*;
import java.util.*;

class Solution {
    public void nonRepeatingCharacter(String s) 
    {
        // Your code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        String res="";
        for(int i=0;i<s.length();i++)
        {
           if(map.get(s.charAt(i))==1)
           {
            System.out.println(s.charAt(i));
            return ;
           }
        }
        System.out.println("-1");
    }
}

public class first_non_repeating_character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s=sc.next();
        Solution Obj = new Solution();
        Obj.nonRepeatingCharacter(s);  
        System.out.println();
    }
}

import java.io.*;
import java.util.*;

class Solution 
{
    HashMap<Character,Integer> map1 ;
    HashMap<Character,Integer> map2 ;
    public boolean check ()
    {
        for(char key:map2.keySet())
        {
            if(!map1.containsKey(key))
            {
                return false;
            }
            else 
            {
                if(map1.get(key)<map2.get(key))
                {
                    return false;
                }
            }
        }
        return true;
    } 
    public String minWindow(String s, String t) 
    {
		// write code here
        map1 = new HashMap<>();
        map2 = new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            char ch2=t.charAt(i);
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
        }
        int i=0;
        int j=0;
        int start=-1;
        int len=s.length()+1;
        while(j<s.length())
        {
            char ch1=s.charAt(j);
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);

            while(check()==true)
            {
                if((j-i+1)<len)
                {
                    start=i;
                    len=j-i+1;
                }
                map1.put(s.charAt(i),map1.get(s.charAt(i))-1);
                if(map1.get(s.charAt(i))==0)
                {
                    map1.remove(s.charAt(i));
                }
                i++;
            }
            j++;
        }
        if(start==-1)
        {
            return "";
        }

      return s.substring(start,start+len); 
    }
}

public class  minimum_window_substring{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s,t;
        s = sc.next();
		t = sc.next();
        Solution Obj = new Solution();
        System.out.print(Obj.minWindow(s,t));
    }
}

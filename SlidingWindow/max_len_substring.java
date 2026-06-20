import java.io.*;
import java.util.*;

class Solution {
    public static int longestUniqueSubsttr(String s)
    {
        // Your code here
        int l=0;
        int r=0;
        int ans=0;
        HashSet<Character> set = new HashSet<>();
        while(r<s.length())
        {
         while(set.contains(s.charAt(r)))
         {
            set.remove(s.charAt(l));
            l++;
         }
         set.add(s.charAt(r));
         ans=Math.max(ans,r-l+1);
         r++;
        }
        return ans;
    }
}

public class max_len_substring {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Solution obj = new Solution();
        int len = obj.longestUniqueSubsttr(str);
        System.out.println(len);
    }
}


import java.util.*;

class Solution {
   static boolean areAnagram(String c1, String c2) 
    {
       //Write your code here
       HashMap<Character,Integer> map1 = new HashMap<>();
       HashMap<Character,Integer> map2 = new HashMap<>();
       for(int i=0;i<c1.length();i++)
       {
        char ch1=c1.charAt(i);
        map1.put(ch1,map1.getOrDefault(ch1,0)+1);
       }
        for(int i=0;i<c2.length();i++)
       {
        char ch2=c2.charAt(i);
        map2.put(ch2,map2.getOrDefault(ch2,0)+1);
       }
       for(char key: map1.keySet())
       {
        if(!(map2.containsKey(key)))
        {
            return false;
        }
        else
        {
            if((map1.get(key))!= (map2.get(key)))
            {
                return false;
            }
        }
       }
       return true;
    }
}

public class valid_AnaGram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Solution Obj = new Solution();
        
        if (Obj.areAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

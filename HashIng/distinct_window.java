import java.util.*;

public class distinct_window
{
    public static boolean check (HashMap<Character,Integer> map1, HashMap<Character,Integer> map2)
    {
        for(char key :map2.keySet())
        {
            if(!map1.containsKey(key))
            {
                return false;
            }
        }
        return true;
    } 
    public static String DistinctWindow(String s)
    {
        //write code here\
         
      HashMap<Character,Integer>   map1 = new HashMap<>();
      HashMap<Character,Integer>   map2 = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch2=s.charAt(i);
            if(!map2.containsKey(ch2))
            {
                map2.put(ch2,1);
            }
        }
        int i=0;
        int j=0;
        int start=-1;
        int len=s.length()+1;
        while(j<s.length())
        {
            char ch1=s.charAt(j);
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);

            while(check(map1,map2)==true)
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

    

    public static void main(String[] args) throws Throwable 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = DistinctWindow(s);
        System.out.println(ans);
    }
}

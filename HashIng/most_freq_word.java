import java.io.*;
import java.util.*;

class Solution {
    public void mostFrequent(String []arr, int n)
    {
        // write your code here
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        int max=0;
        for(int i=0;i<n;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            int k=map.get(arr[i]);
            max=Math.max(k,max);
        }
        if(max==1)
        {
            System.out.println(arr[n-1]);
            return ;
        }
        ArrayList<String> res = new ArrayList<>();
        for(String str:map.keySet())
        {   
             if(map.get(str)==max)
             {
               res.add(str);
             }
        }
        System.out.println(res.get(res.size()-1)); 
    }
}
public class most_freq_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String []arr = new String[n];
        for(int i=0;i<n;++i){
                arr[i] = sc.next();
        }
        Solution Obj = new Solution();
        Obj.mostFrequent(arr,n);  
        System.out.println('\n');
    }
}

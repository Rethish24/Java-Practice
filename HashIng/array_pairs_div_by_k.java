import java.io.*;
import java.util.*;

class Solution {
    public boolean arrayPairs(int[] arr, int k) 
    {
		// write code here
        if(arr.length %2!=0)
        {
            return false;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
              int rem=arr[i]%k;
              map.put(rem,map.getOrDefault(rem,0)+1);
        }
        for(int rem: map.keySet())
        {
            if(rem==0)
            {
                if(map.get(rem)%2!=0)    // 5 10 15  0-->3 so xxx
                {
                    return false;
                }
            }
            else
            {
                int rem2= k-rem;
                if(!map.containsKey(rem2))
                {
                    return false;
                }
                else
                {
                    if( map.get(rem)!=map.get(rem2))
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

public class array_pairs_div_by_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
		k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        if(Obj.arrayPairs(arr,k)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
    }
}

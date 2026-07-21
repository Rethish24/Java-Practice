import java.util.*;

class Solution {
    static void missingNumbers(int n, int arr[], int m, int brr[]) 
    {
        //Write your code here
        HashMap<Integer,Integer> set1= new HashMap<>();
        HashMap<Integer,Integer> set2= new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            set1.put(arr[i],set1.getOrDefault(arr[i],0)+1);
        }
        for(int j=0;j<m;j++)
        {
            set2.put(brr[j],set2.getOrDefault(brr[j],0)+1);
        }
        for(int k:set2.keySet())
        {
            if(!(set1.containsKey(k)))
            {
                res.add(k);
            }
            else
            {
                if((set1.get(k))!=(set2.get(k)))
                {
                    res.add(k);
                }
            }
        }
        if(res.size()==0)
        {
            System.out.println("-1");
        }
        else
        {
        Collections.sort(res);
        int l=0;
        while(l<res.size())
        {
            System.out.print(res.get(l)+" ");
            l++;
        }
        }
    }

}

public class Find_missing_no{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int m = sc.nextInt();
        int brr[] = new int[m];
        for(int i=0; i<m; i++){
            brr[i]= sc.nextInt();
        }

        Solution Obj = new Solution();
        Obj.missingNumbers(n,arr,m,brr);
    }
}

import java.util.*;

public class two_sum_pairs {

    public static List<List<Integer>> twoSum(int[] arr, int target) 
    {
      // write your code here
      HashSet<List<Integer>> set = new HashSet<>();
      int l=0;
      int r=arr.length-1;
      Arrays.sort(arr);
      while(l<r)
      {
        int sum=arr[l]+arr[r];
        if(sum==target)
        {
             set.add(List.of(arr[l],arr[r]));
             l++;
             r--;
        }
        else if(sum<target)
        {
            l++;
        }
        else if(sum>target)
        {
            r--;
        }
        
      }
      List<List<Integer>> finalList = new ArrayList<>(set);
      return finalList;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int target = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        List<List<Integer>> res = twoSum(arr, target);
        ArrayList<String> finalResult = new ArrayList<>();
        for (List<Integer> list : res) {
            //Collections.sort(list);
            String ans = "";
            for (int val : list) {
              ans += val + " ";
            }
            finalResult.add(ans);
        }
        Collections.sort(finalResult);
        for (String str : finalResult) {
            System.out.println(str);
        }
    }
}

class two_sum {
    public int check(int []nums,int x,int k)
    {
        for(int i=0;i<nums.length;i++)
        {
           if(nums[i]==x && i!=k)
           {
            return i;
           }
        }
        return -1;
    }
    public int[] twoSum(int[] nums, int target)  // o(nlogn)
    {
        int [] ans= new int[2];
        int []temp=nums.clone();
        Arrays.sort(temp);
        int l=0;
        int r=temp.length-1;
        while(l<r)
        {
            int sum=temp[l]+temp[r];
            if(sum==target)
            {
               ans[0]=check(nums,temp[l],-1);
               ans[1]=check(nums,temp[r],ans[0]);
               break;
            }
            else if(sum>target)
            {
                r--;
            }
            else if(sum<target)
            {
                l++;
            }
        }


      /*
      class Solution {
    public int[] twoSum(int[] nums, int target) 
    {   
        int n=nums.length;
        int [] res = new int [2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {   if(i!=j)
                {
                if(nums[i]+nums[j]==target)
                {
                    res[0]=i;
                    res[1]=j;
                    break;    
                }
                }
            }
        }
        return res;
    }
}
      */
        return ans;
    }
}

class missing_number {
    public int missingNumber(int[] nums) 
    {
        /*
        int mis=-1;
        int i=0;
        while(i<nums.length+1)
        {   
            boolean check=false;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==i)
                {
                    check =true;
                    break;
                }
            }
            if(check==false)
            {
                mis=i;
                break;
            }
            i++;
        }
        int mis=-1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
           if(i!=nums[i])
           {
              mis=i;
              break;
           }
        }
        if(mis==-1)
        {
           return mis=nums.length;
        }*/
        int n=nums.length;
        int tot=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++)
        {
          sum=sum+nums[i];
        }
        return tot-sum;
    }
  public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int nums[]=new int[n];
    for(int i=0;i<n;i++)
      {
        nums[i]=sc.nextInt();
      }
    int ans=missingNumber(nums);
    System.out.println(ans);
  }

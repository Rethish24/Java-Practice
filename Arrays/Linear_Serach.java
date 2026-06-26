import java.util.*;
class Linear_Search {
    public int linearSearch(int nums[], int target) 
    {
		//Your code goes here
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args)
  {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int [] a= new int[n];
    for(int i=0;i<n;i++)
      {
             a[i]=sc.nextInt();
      }
    int k=sc.nextInt();
    int x=linearSearch(a,k);
    System.out.println(x);
  }
}

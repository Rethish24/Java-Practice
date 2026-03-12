import java.util.Scanner;

public class count_of_element_in_array 
{
static int array11(int[] nums, int i) 
    {
        //Write your code here
        if(i>nums.length-1)
        {
            return 0;
        }
        int r=array11(nums,i+1);
        return r+((nums[i]==11)?1:0);
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(array11(arr, 0));
    }    
}

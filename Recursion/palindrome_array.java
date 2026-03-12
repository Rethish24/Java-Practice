import java.util.Scanner;

public class palindrome_array
{
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();
       
        System.out.println(isPalindrome(arr,0,n-1));
    }

	public static boolean isPalindrome(int[] arr,int si,int ei) 
    {
           // write your code here
           if(si>=ei)
           {
            return true;
           }
           if(arr[si]!=arr[ei])
           {
            return false;
           }
           boolean res= isPalindrome(arr,si+1,ei-1);
           return res;
    }
   
}

import java.util.Arrays;
import java.util.Scanner;

public class roatate_array {

    public static void reverse(int []arr,int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotateArray(int[] nums, int k) 
    {
           // write your code here
           int n=nums.length;
           reverse(nums,0,n-1);
           reverse(nums,0,k-1);
           reverse(nums,k,n-1);   
    }

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        rotateArray(arr, k);
        
        for(int num : arr){
            System.out.print(num + " "); 
        }
        
        scanner.close();
    }
}

import java.io.*;
import java.util.*;


public class maximum_diff_between_two_elements_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
        }
        ArrayProblem(arr);  
    }

    
    public static void ArrayProblem(int []arr) 
    {
          int min=0;
          int max=0;
          if(arr[0]>arr[1])
          {
            max=arr[0];
            min=arr[1];
          }
          else
          {
            max=arr[1];
            min=arr[0];
          }
          for(int i=0;i<arr.length;i++)
         {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            else if(arr[i]<min)
            {
                 min=arr[i];
            }
         }
      System.out.println(max-min);
    }
}

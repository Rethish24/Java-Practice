package SortingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class findtargetindex 
{
 static int findIndex(int[] a, int n, int k)
     {
            // write your code here
            /*int res=0;
            for(int i=0;i<n-1;i++)
            {   
                boolean flag=false;
                for(int j=0;j<n-1-i;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                        flag=true;
                    }
                }
                if(flag==false)
                {
                    break;
                }
            }*/
            Arrays.sort(a);
            int result=0;
                for(int i=0;i<n;i++)
            {
                if(a[i]==k)
                {
                    result=i;
                    break;  
                }
            }
            return result;
            
        }

            
     

    // Main function
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Input size of array
        int[] arr = new int[n]; // Declare array of size n

        // Input elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt(); // Input value of k

        // Call the function findIndex and store the result in index
        int index = findIndex(arr, n, k);

        // Output the result
        System.out.println(index);

        scanner.close(); // Close the scanner
    }    
}

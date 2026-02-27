package SortingAlgorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class countingtripletshavingmaxdistance 
{
    
static int sorting4(int n, int[] a, int l)
    {
        //Write your code here
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n;j++ )
            {
               for(int k=j+1;k<n;k++)
               {
                 if((a[k]-a[i])<=l)
                 {
                      count++;
                 }
               }
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputLine;
        inputLine = br.readLine().trim().split(" ");
        int n = Integer.parseInt(inputLine[0]);
        int[] arr = new int[n];

        inputLine = br.readLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(inputLine[i]);
        }
        inputLine = br.readLine().trim().split(" ");
        int l = Integer.parseInt(inputLine[0]);

        int ans= sorting4(n, arr, l);
        System.out.println(ans);
    }
}

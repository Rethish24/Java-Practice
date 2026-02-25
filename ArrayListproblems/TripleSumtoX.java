package ArrayListproblems;

import java.util.ArrayList;
import java.util.Scanner;

/*

Triplet Sum to X
You have been given a non-decreasing integer ArrayList(arr) and a number X. Find and return the number of distinct triplets in the ArrayList which sum to X.

Note

Given ArrayList is sorted and can contain duplicate elements.

Input format
The first line contains an Integer t which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer N representing the size of the first ArrayList.

The second line contains N single space-separated integers representing the elements in the ArrayList.

The third line contains an integer X.

Output format
For each test case, print the total number of distinct triplets present in the array/list.
 */
public class TripleSumtoX 
{
   public static int triplets(ArrayList<Integer> a, int X) 
    {
	    // your code here
       int count=0;
      int n=a.size();
      for(int i=0;i<=n-3;i++)
      {
        if(i>0 && a.get(i).equals(a.get(i-1)))
         {
          continue;
         }
        int j =i+1;
        int k=n-1;
        int Y =X-a.get(i);
        while(j<k)
        { 
         int sum =a.get(j)+a.get(k);
         if(sum==Y)
         {
          
          count++;
          while(j<k && a.get(j).equals(a.get(j+1)))
          {
            j++;
          }
          while(j<k && a.get(k).equals(a.get(k-1)))
          {
            k--;
          }

          j++;
          k--;
         }
         else if(sum<Y)
         {
          j++;
         }
         else
         {
          k--;
         }
        }
      }
      return count;
	
	  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t;
    t = sc.nextInt();
    while (t > 0) {
      int n, X;
      n = sc.nextInt();
      ArrayList<Integer> arr = new ArrayList<Integer>(n);
      for (int i = 0; i < n; i++) arr.add(sc.nextInt());
      X = sc.nextInt();
      int result = triplets(arr, X);
      System.out.println(result);
      t--;
    }
    sc.close();
  }

   
}

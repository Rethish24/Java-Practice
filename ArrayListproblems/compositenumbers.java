package ArrayListproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class compositenumbers 
{
    static ArrayList<Integer> removeComposite(int arr[], int len)
{   
    ArrayList<Integer> a = new ArrayList<>();
	for(int i=0;i<len;i++)
    { 
      int count =2;
      for(int j=2;j<arr[i];j++)
      {
        if((arr[i]%j)==0)
        {
            count++;
            break;
        }  
      } 
       if(count==2)
      {
        a.add(arr[i]);
      } 
    }
    return a;
}

public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
	ArrayList<Integer> list = removeComposite(arr, n);
    for(int val : list) System.out.print(val+" ");

}
}

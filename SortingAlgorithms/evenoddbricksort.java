package SortingAlgorithms;

import java.util.Scanner;

public class evenoddbricksort 
{
static void oddEvenSort(int a[], int n)
    {
        //Write your code here
        for(int i=0;i<n;i++)
        {   
            boolean flag =false;
            for(int j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    flag =true;
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
                
            }
            if(flag==false)
                {
                    break;
                }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        oddEvenSort(array,n);
    }    
}

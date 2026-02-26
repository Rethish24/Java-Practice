package SortingAlgorithms;
import java.util.Scanner;
public class bubblesort
{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[] = new int[N];

        // Input of array
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // bubble sort in descending order
        bubbleSort(N, arr);
        // printing array elements
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    public static void bubbleSort(int n, int[] a)
    {
        // your code here
        for(int i=0;i<=n-2;i++)
        {   boolean flag = false;
            for(int j=0;j<=n-2-i;j++)
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

    }
    
}

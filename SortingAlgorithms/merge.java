package SortingAlgorithms;

import java.util.Scanner;

public class merge 
{
static void mergeSort(int[] arr,int l,int r)
        {
            if(l>=r)
            {
                return ;
            }
          int mid=(l+r)/2;
          mergeSort(arr,l,mid);
          mergeSort(arr,mid+1,r);
          merge(arr,l,mid,r);
        }
        public static void  merge(int[] arr,int l,int m,int r)
        {
            int []fh=new int[m-l+1];
            for(int i=0,j=l;i<fh.length;i++,j++)
            {
                fh[i]=arr[j];
            }
            int []sh=new int[r-m];
            for(int i=0,j=m+1;i<sh.length;i++,j++)
            {
                sh[i]=arr[j];
            }
            int i=0;
            int j=0;
            int k=l;
            while(i<fh.length && j<sh.length)
            {
                if(fh[i]<sh[j])
                {
                    arr[k]=fh[i];
                    i++;
                }
                else
                {
                    arr[k]=sh[j];
                    j++;
                }
                k++;
            }
            
                while(i<fh.length)
                {
                    arr[k]=fh[i];
                    i++;
                    k++;
                }
            
            
                while(j<sh.length)
                {
                    arr[k]=sh[j];
                    j++;
                    k++;
                }
            
        }


    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i= 0; i < n; i++)
            a[i] = input.nextInt();
        mergeSort(a,0,n-1);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        input.close();
    }    
}

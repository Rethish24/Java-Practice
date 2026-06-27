import java.util.*;

public class geometric_triplets {
    
    public static void findGeometricTriplets(int arr[], int n) 
    {
        // Write code here
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                 double gp=(double)arr[j]/arr[i];
                 for(int k=j+1;k<n;k++)
                 {
                    double gp2=(double)arr[k]/arr[j];
                    if(gp==gp2)
                    {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                 }
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        findGeometricTriplets(arr, N);
        sc.close();
    }
}

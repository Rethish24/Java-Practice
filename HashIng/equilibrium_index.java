import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ans = Solution.findEquilibriumIndex(a);
        System.out.println(ans);
    }
}

class equilibrium_index {
    static int findEquilibriumIndex(int[] a) 
    {
        //Write code here
        int n=a.length;
        int[]leftsum= new int[n];
        leftsum[0]=0;
        int sum=a[0];
        for(int i=1;i<n;i++)
        {
           leftsum[i]=sum;
           sum+=a[i];
        }
        int rightsum[] = new int[n];
        rightsum[n-1]=0;
        sum=a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightsum[i]=sum;
            sum+=a[i];
        }
        for(int i=0;i<n;i++)
        {
            if(leftsum[i]==rightsum[i])
            {
                return i;
            }
        }
        return -1;
    }
}

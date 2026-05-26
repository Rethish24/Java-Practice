import java.util.Scanner;

public class min_dis_between_twoevenpos 
{
public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem6(n,arr);
        System.out.println(ans);
    }
    public static int ArrayProblem6(int n, int[] arr)
    {
        // Write code here
        /*int dis=Integer.MAX_VALUE;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0 && arr[i]%2==0 )
            {   
                count++;
                for(int j=i+1;j<n;j++)
                {
                 if(arr[j]%2==0)
                 {
                    dis=Math.min(dis,Math.abs(i-j));
                 }
                }
            }
        }
        if(count==0 ||count==1)
        {
            return -1;
        }
        else
        {
            return dis;
        }*/
        int prev=-1;
        int count=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0 && arr[i]%2==0)
            {
                count++;
                if(prev!=-1)
                {
                    min=Math.min(min,i-prev);
                }
                prev=i;
            }
        }
        if(count<=1)
        {
            return -1;
        }
        else
        {
            return min;
        }
    }    
}

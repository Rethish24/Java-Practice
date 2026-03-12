import java.util.Scanner;

public class count_1 
{
static int count1(int n) 
    {
        if(n==0)
        {
            return 0;
        }
        int r=count1(n/10);
        return r+((n%10==1)?1:0);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count1(n));
        sc.close();
    }
    
}

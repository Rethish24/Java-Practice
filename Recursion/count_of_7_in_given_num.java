import java.util.Scanner;

public class count_of_7_in_given_num 
{
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count7(n));
        sc.close();
    }

    public static int count7(int n) 
    {
        // your code here
        if(n==0)
        {
            return 0;
        }
        int r=count7(n/10);
        return r+((n%10==7)?1:0);
    }    
}

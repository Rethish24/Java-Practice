

import java.util.Scanner;

public class numberofdigits 
{
    static int numOfDigi(int n) 
    {
        //Write code here
        if(n==0)
        {
            return 0;
        }
        int r=numOfDigi(n/10);
        return r+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int result = numOfDigi(n);
        System.out.println(result);
        sc.close();
    }
}

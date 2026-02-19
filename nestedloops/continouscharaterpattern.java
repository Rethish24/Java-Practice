package nestedloops;

import java.util.Scanner;

public class continouscharaterpattern 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.close();
        // write code here
        //char ch='A';
        for(int i=1;i<=n;i++)
        {   int k=i-1;
            for(int j=1;j<=i;j++)
            {
            int id =65+k%26;
            char ch =(char)id;
            System.out.print(ch);
            k++;
            }
            System.out.println();
        }
    }
}

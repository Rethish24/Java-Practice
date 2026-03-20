package Strings;

import java.util.Scanner;

public class max_frequency 
{
   
     static char MaximumFrequencyChar(String s) 
    {
        //Write your code here
        int n=s.length();
        int [] a =new int[26];
        int max=0;
        for(int i=0;i<n;i++)
        {   
            char ch =s.charAt(i);
            int k =ch-'a';
            a[k]=a[k]+1;
            if(max<k)
            {
                max=k;
            }
        }
        int hf=0;
        char ch=' ';
        for(int i=0;i<=max;i++)
        {
             if(a[i]>hf)
             {
                hf=a[i];
                ch=(char)(97+i); 
             }
        }
        return ch;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(MaximumFrequencyChar(s));
        scanner.close();
    } 
}

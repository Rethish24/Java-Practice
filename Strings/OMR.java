package Strings;

import java.util.Scanner;

public class OMR 
{
 static void ptice(int n, String key) 
    {
        // Write your code here and print output in this function
        String patA="ABC";
        String patB="BABC";
        String patG="CCAABB";
        int countA=0;
        int countB=0;
        int countC=0;
        for(int i=0;i<n;i++)
        {
            if(key.charAt(i)==patA.charAt(i%3))
            {
                countA++;
            }
            if(key.charAt(i)==patB.charAt(i%4))
            {
                countB++;
            }
            if(key.charAt(i)==patG.charAt(i%6))
            {
                countC++;
            }
        }
        int max =Math.max(countA,countB);
        max=Math.max(max,countC);
        System.out.println(max);
        if(max==countA)
        {
            System.out.println("Adrian");
        } 
        if(max==countB)
        {
            System.out.println("Bruno");
        } 
        if(max==countC)
        {
            System.out.println("Goran");
        } 
        
    }  
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String str = sc.next();
        ptice(n, str);
        sc.close();
    }    
}

package loops;

import java.util.Scanner;

/*Number Rotation
Given two numbers n and k, you need to rotate n, k times to the right. If k is negative, rotate n, k times to the left.

Note:

Rotating right means removing rightmost digit from n and adding it to the start.

Rotating left means removing leftmost digit from n and adding it to the end.

Assume that the number of rotations will not result in leading 0's, i.e. n=1203, k =2 such that 0312 is the answer, such test cases will not be given.

k can be bigger than n.*/
public class NumberRotation 
{
  public static void main(String[] args) {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num, k;
        num = sc.nextInt();
        k = sc.nextInt();
        int n=0;
        int temp=num;
        // to find the no.of digits 
        while(temp>0)
        {
            n++;
            temp=temp/10;
        }
        //System.out.println(n);4
        // step 1 converting the given k value into the base cases 
        k=k%n;
        //System.out.println(k);1
        // step 2 converting LR into RR( converting the -k into corresponding +k)
        if(k<0)
        {
            k=k+n;
        }
        // step 3 here we are extracting the k digits from given number        
        int rev=0;
        int tempk=k;
        while(tempk>0)
        {
            int d=num%10;
            rev=(rev*10)+d;
            num=num/10;
            tempk--;
        }
        //System.out.println(rev);6
        // step 4 rotating the k digits extracted above
        int rot=0;
        while(rev>0)
        {   
            int di=rev%10;
            rot=(rot*10)+di;
            rev=rev/10;
        }
        //System.out.println(rot);6
        //System.out.println(rot);
        // mutliplying the rotated number with 10 for n-k times and adding the remaining num 
     
        int j=n-k;
        int frot=rot;
        while(j>0)
        {
          frot=frot*10;
          j--;
        }
       // System.out.println(frot);
        frot=frot+num;
        // finally number roation for given number and k value
        System.out.println(frot);
        sc.close();
    }
    



}

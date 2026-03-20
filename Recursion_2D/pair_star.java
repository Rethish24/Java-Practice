package Recursion_2D;
import java.util.Scanner;
public class pair_star 
{
    static String PairStar(String str,int i,StringBuilder sb) 
    {
        //Write your code here
        if(i==str.length()-1)
        {
            sb.append(str.charAt(i));
            return sb.toString();
        }
        sb.append(str.charAt(i));
        if(str.charAt(i)==str.charAt(i+1))
        {
            sb.append("*");
        }
        String s=PairStar(str,i+1,sb);
        return s;

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        System.out.println(PairStar(s,0,sb));
        sc.close();
    }
}

    
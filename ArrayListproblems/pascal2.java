package ArrayListproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class pascal2 
{
public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> triangle = pascalTriangleRow(n);
        for (int i = 0; i < triangle.size(); i++) {
            System.out.print(triangle.get(i) + " ");
        }
    }

	public static ArrayList<Integer> pascalTriangleRow(int n) 
    {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++)
        {   
            ArrayList<Integer> cur =new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 ||i==j)
                {
                   cur.add(1);
                }
                else
                {
                    int val1=res.get(i-1).get(j);
                    int val2=res.get(i-1).get(j-1);
                    int curval = val1+val2;
                    cur.add(curval);
                }
            }
            res.add(cur);
        }
        ArrayList<Integer>f = new ArrayList<>(n);
        for(int i=n-1;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int val=res.get(i).get(j);
                f.add(val);
            }
        }
        return f;
    }    
}

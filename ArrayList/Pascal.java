package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Pascal 
{
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

	public static ArrayList<ArrayList<Integer>> pascalTriangle(int n) 
    {
        // write code here
        ArrayList<ArrayList<Integer>> res =new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> currow = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||i==j)
                {
                    currow.add(1);
                }
                else
                {
                    int prev1=res.get(i-1).get(j);
                    int prev2=res.get(i-1).get(j-1);
                    int curval=prev1+prev2;
                    currow.add(curval);
                }
            }
            res.add(currow);
        }
        return res;
    }
}

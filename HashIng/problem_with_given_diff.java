import java.io.*;
import java.util.*;

class Solution {
    public int givenDifference(int []A, int n, int B) 
    {
        // write your code here
        boolean res=false;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int op1=A[i]+B;
            int op2=A[i]-B;
          if(set.contains(op1)||set.contains(op2))
          {
            res=true;
          }
            set.add(A[i]);
        }
        return (res==true)?1:0;
    }
}

public class problem_with_given_diff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,B;
        n = sc.nextInt();
        int []mat=new int[n];
        for(int i=0;i<n;++i){
            mat[i]=sc.nextInt();
        }
        B = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.givenDifference(mat,n,B));
        System.out.println('\n');
    }
}

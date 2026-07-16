import java.util.*;

class Solution 
{      
    HashSet<Integer> set = new HashSet<>();

    public void add(int key) 
    {
        //Complete the function
        set.add(key);
    }

    public void remove(int key) 
    {
        //Complete the function
        set.remove(key);
    }

    public boolean contains(int key) 
    {
        //Complete the function
        boolean res=set.contains(key)?true:false;
        return res;
    }
}

public class  design_hashset{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Solution Obj = new Solution();
        for (int i = 0; i < q; i++) {
            int choice = sc.nextInt();
            int key = sc.nextInt();
            if (choice == 1) {
                // Add
                Obj.add(key);
            } else if (choice == 2) {
                // contains
                if (Obj.contains(key)) {
                    System.out.print("True ");
                } else {
                    System.out.print("False ");
                }
            } else if (choice == 3) {
                // remove
                Obj.remove(key);
            }
        }
        System.out.println();
        sc.close();
    }
}

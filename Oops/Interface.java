package Oops;
import java.util.*;

interface AdvancedArithmetic {
    int divisorSum(int n);
}
class MyCalculator implements AdvancedArithmetic
{

public int divisorSum(int n)
{
    int sum=0;
    for(int i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            sum+=i;
        }
    }
    return sum;
}

}


class Solution {
    public void solve() {
        MyCalculator myCalculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(myCalculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(myCalculator.divisorSum(n) + "\n");
        sc.close();
    }

    /*
     * ImplementedInterfaceNames method takes an object and prints the name of the
     * interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o) {
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

public class Interface{

    public static void main(String[] args) {
        Solution ob = new Solution();
        ob.solve();
    }
}
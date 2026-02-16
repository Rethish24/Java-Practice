package Divisibility;
import java.util.*;

public class divisibility_5 {
    public static void main(String args[]) {
        // i am writing the code for divisibility of 5
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
        int num = n % 10;
        if (num == 0 || num == 5) {
            System.out.print(n + " is divisible by 5");
        } else {
            System.out.print(n + " is  not divisible by 5");
        }
in.close();
    }
}
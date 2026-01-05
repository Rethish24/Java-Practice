import java.util.*;

public class divisibility_4 {
    public static void main(String args[]) {
        // i am writing the code for divisibility of 4
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
        int num = n % 100;
        if (num % 4 == 0) {
            System.out.print(n + " is divisible by 4");
        } else {
            System.out.print(n + " is  not divisible by 4");
        }

    }
}
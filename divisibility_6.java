import java.util.*;

public class divisibility_6 {
    public static void main(String args[]) {
        // i am writing the code for divisibility of 6
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
        int sum = 0;
        int num = n;
        int x = n % 10;
        if (x % 2 == 0) {
            while (n > 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
            
            if (sum % 3 == 0) {
                System.out.print(num + " is divisible by 6");
            } else {
                System.out.print(num + " is divisible by 2 and not by 3,6");
            }
        }

        else {
            System.out.print(num + " is not divisible by 6");
        }

    }
}
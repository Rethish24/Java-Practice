/*Celsius to Fahrenheit 2
Given a temperature in Celsius, output the fahrenheit equivalent of it.

Note

Print complete answer up to 6 decimal places.

To do so, you can use the System.out.printf() function in Java

For example,

float myFloat = 76.45678f;
System.out.printf("%.3f", myFloat); */

import java.util.Scanner;

public class temperatureconversion
 {
    public static void main(String[] args) 
    {
        // Your code here
        Scanner t = new Scanner(System.in);
        float tempc=t.nextInt();
        float tempf=((9*tempc)/5)+32;
        System.out.printf("%.6f",tempf);
    }
}

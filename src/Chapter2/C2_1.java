package Chapter2;

import java.util.Scanner;

/**
 * Program changes Celsius to Fahrenheit
 *
 * @author Eric Zacarias
*/

public class C2_1 
{
    public static void main(String[] args) 
    {   
        Scanner in = new Scanner(System.in);
        System.out.print("What is the degree in Celsius:");
        double c = in.nextDouble();
        double f = ((9 / 5) * c) + 32;
        System.out.println(f);       
    }
}

package Chapter2;

import java.util.Scanner;

/**
 * Program calculates the volume of a cylinder
 *
 * @author Eric Zacarias
*/

public class C2_2 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter the radius of a cylinder: ");
        double r = in.nextDouble();
        
        System.out.print("Enter the length of a cylinder: ");
        double l = in.nextDouble();
        
        double a = r * r * 3.14;
        double v = a * l;
        
        System.out.print(v);
    }
}

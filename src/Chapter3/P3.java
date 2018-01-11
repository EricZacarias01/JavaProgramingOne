package Chapter3;

import java.util.Scanner;

/**
 * Program tells the user what letter grade they got
 *
 * @author Eric Zacarias
*/

public class P3 
{
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(System.in); 
        System.out.println("Type your first number: ");
        int a = in.nextInt();
        System.out.println("Type your second number: ");
        int b = in.nextInt();
        
        if (a > b)
            System.out.println("first num is greater than second.");
        else if (b > a)
            System.out.println("second num is greater than first.");
        else if (b == a)
            System.out.println("they are equal");
        else if (a != b);
            System.out.println("they are not equal");
          
        if (a >= 90) 
           System.out.println("A");
        else if (a >= 80)
            System.out.println("B");
        else if (a >= 70)
            System.out.println("C");
        else if (a >=60)
            System.out.println("D"); 
    }  
}
package Chapter3;

import java.util.Scanner;

/**
 * Program tells the user if the integer is divisible by 6 or 7, 
 * 6 and 7, and 6 or 7 but not both.
 *
 * @author Eric Zacarias
*/

public class C3_26
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your integer: ");
        int x = input.nextInt();
        
        boolean bool01 = (x % 5 == 0) && (x % 6 == 0);
        boolean bool02 = (x % 5 == 0) || (x  % 6 == 0);
        boolean bool03 = (x  % 5 == 0) ^ (x % 6 == 0);
        
        System.out.println("Is 10 divisible by 5 and 6? " + bool01);
        System.out.println("Is 10 divisible by 5 or 6? " + bool02);
        System.out.println("Is 10 divisible by 5 or 6, but not both? " + bool03);
       
    }
}

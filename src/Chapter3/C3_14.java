package Chapter3;

import java.util.Scanner;

/**
 * Program lets the user guess heads or tails and tells them if they
 * guessed correctly or incorrectly
 * @author Eric Zacarias
*/

public class C3_14 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int ht = (int)(Math.random() * 2);
        
        System.out.print("Heads(0) or tails(1)?");
        int g = input.nextInt();
        if (ht == g) 
        {
            System.out.println("You were correct!!");
        }
        else
        {
            System.out.println("You were incorrect!!");
        }
    }
}

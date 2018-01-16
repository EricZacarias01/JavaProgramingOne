package Chapter5;

import java.util.Scanner;

/**
 * Program displays something entered from a user backwards
 *
 * @author Eric Zacarias
 */
public class C5_46 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String x = in.next();
        String x2 = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            x2 += x.charAt(i);
        }

        System.out.println("The string in reverse is " + x2);
    }
}

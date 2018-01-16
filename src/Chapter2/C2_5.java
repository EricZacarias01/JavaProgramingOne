package Chapter2;

import java.util.Scanner;

/**
 * Program calculates the gratuity and the total
 *
 * @author Eric Zacarias
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        double s = in.nextDouble();

        System.out.print("Enter the graduate rate: ");
        double gr = in.nextDouble();

        double g = (gr / 100) * s;
        double t = g + s;

        System.out.println("The gratuity is " + g + " and the total is " + t);

    }

}

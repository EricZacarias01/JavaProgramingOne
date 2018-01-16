package Chapter3;

import java.util.Scanner;

/**
 * Program tells the user which item is a better price
 *
 * @author Eric Zacarias
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price of your first pacage: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        if (price1 / weight1 < price2 / weight2) {
            System.out.println("The first pacage is better.");
        } else if (price1 / weight1 > price2 / weight2) {
            System.out.println("The second pacage is better.");
        } else {
            System.out.println("They are the same price.");
        }
    }
}

package Chapter2;

import java.util.Scanner;

/**
 * Program calculates the total cost of the meal
 *
 * @author Eric Zacarias
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What was the price of the meal:");
        double m = scanner.nextDouble();
        System.out.println("What was the price of the drink:");
        double dr = scanner.nextDouble();
        System.out.println("What was the price of desert:");
        double de = scanner.nextDouble();
        double price = de + dr + m;
        double tax = .1 * price;
        double tip = (price + tax) * .15;
        double total = price + tax + tip;
        System.out.println("The cost of the food is " + price + "$.");
        System.out.println("The tax is " + tax + "$.");
        System.out.println("The tip is " + tip + "$.");
        System.out.println("The total is " + total + "$.");
    }
}

package Chapter4;

import java.util.Scanner;

/**
 * Program tells the user which bidder is the better choice
 *
 * @author Eric Zacarias
*/

public class P4
{

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("What is the name of the first bidder?");
        String bidder01 = in.next();
        System.out.print("How many hours does the first bidder require?");
        int bidderHours01 = in.nextInt();
        System.out.print("How much does the first bidder charge per hour?");
        double bidderCharge01 = in.nextDouble();
        
        System.out.print("What is the name of the second bidder?");
        String bidder02 = in.next();
        System.out.print("How many hours does the second bidder require?");
        int bidderHours02 = in.nextInt();
        System.out.print("How much does the second bidder charge per hour?");
        double bidderCharge02 = in.nextDouble();
        
        double bidderCost01 = bidderHours01 * bidderCharge01;
        double bidderCost02 = bidderHours02 * bidderCharge02;
        
        if (bidderHours01 < bidderHours02) 
        {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", bidder01, bidderCost01, bidderHours01);
        }
        else if (bidderHours01 > bidderHours02) 
        {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", bidder02, bidderCost02, bidderHours02);
        }
        else if (bidderCost01 == bidderCost02 && bidderHours01 < bidderHours02 ) 
        {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", bidder01, bidderCost01, bidderHours01);
        }
        else if (bidderCost01 == bidderCost02 && bidderHours01 > bidderHours02) 
        {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", bidder02, bidderCost02, bidderHours02);
        }
        else if (bidderCost01 == bidderCost02 && bidderHours01 == bidderHours02) 
        {
           System.out.println("The bidders are the same price."); 
           System.out.printf("total cost of %.2f and %d hours",  bidderCost02, bidderHours02);
        }
    }
    
}
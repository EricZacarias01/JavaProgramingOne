package Chapter4;

import java.util.Scanner;

/**
 * Program tells the user his gross income and net pay
 *
 * @author Eric Zacarias
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Employee's name:");
        String name = in.next();

        System.out.print("Enter number of hours worked:");
        double hoursWorked = in.nextDouble();

        System.out.print("Enter hourly pay rate:");
        double hourlyRate = in.nextDouble();

        System.out.print("Enter federal tax withholding rate:");
        double fedTaxWR = in.nextDouble();

        System.out.print("Enter state tax withholding rate:");
        double stateTaxWR = in.nextDouble();

        double grossPay = hourlyRate * hoursWorked;
        double fedW = grossPay * fedTaxWR;
        double stateW = grossPay * stateTaxWR;
        double totalDeduction = fedW + stateW;
        double netPay = grossPay - totalDeduction;

        System.out.printf("\nEmployee Name: %s", name);
        System.out.printf("\nHours Worked: %.2f", hoursWorked);
        System.out.printf("\nPayRate: $%.2f", hourlyRate);
        System.out.printf("\nGross Pay: $%.2f", grossPay);
        System.out.printf("\nDeductions:\n   Federal Witholding (%.2f%%): $%.2f\n   State Witholding (%.2f%%): $%.2f\n   Total Deduction: $%.2f", (fedTaxWR * 100), fedW, (stateTaxWR * 100), stateW, (fedW + stateW));
        System.out.printf("\nNet Pay: $%.2f", netPay);
    }
}

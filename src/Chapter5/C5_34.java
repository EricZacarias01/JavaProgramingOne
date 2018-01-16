package Chapter5;

import java.util.Scanner;

/**
 * Program runs a rock paper scissor game
 *
 * @author Eric Zacarias
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int compWins = 0;
        int humanWins = 0;
        while (Math.abs(compWins - humanWins) <= 2) {
            System.out.println("Choose: scissors (0), rock (1), or papper (2): ");
            int humanIn = in.nextInt();
            int compIn = (int) (Math.random() * 3);
            String strHuman = "";
            switch (humanIn) {
                case 0:
                    strHuman = "scissors";
                    break;
                case 1:
                    strHuman = "rock";
                    break;
                case 2:
                    strHuman = "papper";
                    break;
                default:
                    System.out.println("Invalid Imput...");
                    System.exit(0);
            }
            String strComp = "";
            switch (compIn) {
                case 0:
                    strComp = "scissors";
                    break;
                case 1:
                    strComp = "rock";
                    break;
                case 2:
                    strComp = "papper";
                    break;

            }
            System.out.println("The computer imput: " + strComp + "\nYour imput: " + strHuman);
            if (compIn == humanIn) {
                System.out.println("Its a draw!!");
            } else if (compIn - humanIn == 1 || compIn - humanIn == -2) {
                System.out.println("Computer wins.");
                compWins++;
            } else if (compIn - humanIn == -1 || compIn - humanIn == 2) {
                System.out.println("You Win.");
                humanWins++;
            }
        }
        System.out.println("Good Game. \nComputer had:" + compWins + "\nYou had: "
                + humanWins);
    }
}

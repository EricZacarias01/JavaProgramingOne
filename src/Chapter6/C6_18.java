package Chapter6;

import java.util.Scanner;

/**
 * Program checks if a password fits the correct criteria
 *
 * @author Eric Zacarias
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        /*Ask for password and save the imput*/
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String s = input.nextLine();
        //check for good password
        if (isGoodPassword(s)) {
            System.out.println("Password is VALID: " + s);
        } else {
            System.out.println("NOT VALID PASSWORD: " + s);
        }
    }

    /**
     * Main Method
     *
     * @param password is variable that is being checked
     * @return true or false
     *
     */
    public static boolean isGoodPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (isNumber(ch)) {
                numCount++;
            } else if (isLetter(ch)) {
                charCount++;
            } else {
                return false;

            }
        }
        return (charCount >= 2 && numCount >= 2);
    }

    /**
     * Main Method
     *
     * @param ch is a variable program is checking
     * @return true or false
     */
    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    /**
     * Main Method
     *
     * @param ch is a variable program is checking
     * @return true or false
     *
     */
    public static boolean isNumber(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}

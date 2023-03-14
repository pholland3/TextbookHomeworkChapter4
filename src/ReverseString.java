/**
 * @Class: ReverseString
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 13 March 2023
 *
 * Description - This program accepts a string input from the user, and then reverses the string.
 */

import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the String Reversal program!");
        System.out.println("This program accepts a string input from the user, and then reverses");
        System.out.println("the content of the string.");
        System.out.println("Please enter the string you would like to reverse:");
        String userString = input.nextLine();
        System.out.println("The reverse of your string is: ");
        int length = userString.length();
        while (length > 0) {
            System.out.print(userString.charAt(length - 1));
            length--;
        }

    }
}

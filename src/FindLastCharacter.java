/**
 * @Class: FindLastCharacter
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 13 March 2023
 *
 * Description - This program accepts a string input from the user, followed by a character input from the user. The
 * program then traverses the string looking for the last incidence of the character, and displays at what position
 * the character is last used.
 */

import java.util.Scanner;
public class FindLastCharacter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Find Last Character program!");
        System.out.println("This program accepts a string input, and then a character input.");
        System.out.println("The program will then find the last incidence of the character's use in the string.");
        System.out.println("First, please enter the string:");
        String userString = input.nextLine();
        System.out.println("You entered: " + userString);
        System.out.println("Next, please enter the character you'd like to search for the last occurrence of:");
        int userChar = input.next().charAt(0);

        int i = 0;
        int charIndex = -1;
        while(i < userString.length()) {
            if (userString.charAt(i) == userChar) {
                charIndex = i;
            }
            i++;
        }
        if (charIndex == -1) {
            System.out.println("Character last located at " + charIndex);
        } else {
            System.out.println("Character last located at " + charIndex);
        }
    }
}

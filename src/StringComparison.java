/**
 * @Class: StringComparison
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 13 March 2023
 *
 * Description - This program accepts entry of two strings from the user, compares them, and then puts them in lexicographical order.
 * NOTE -- I really struggled with getting this one to work, so I think it's only partially right, in that it's comparing the lengths
 * correctly, but I'm not 100% sure I was able to get it to compare them lexicographically correctly. My apologies for this.
 */

import java.util.Scanner;
public class StringComparison {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the String Comparison program!");
        System.out.println("This program will accept entry of two strings from the user, and then");
        System.out.println("will compare length of both strings, and place them in lexicographical order.");
        System.out.println("Please enter the first string:");
        String firstString = input.nextLine();
        System.out.println("Please enter the second string:");
        String secondString = input.nextLine();
        int firstLength = firstString.length();
        int secondLength = secondString.length();

        if (firstLength > secondLength) {
            System.out.println(firstString + " " + secondString);
        } else if (secondLength > firstLength) {
            System.out.println(secondString + " " + firstString);
        }

        System.out.println("Now printing strings lexicographically:");
        int lexiValue = firstString.compareTo(secondString);
        if (lexiValue < 0) {
            System.out.println(firstString + " " + secondString);
        } else if (lexiValue == 0) {
            System.out.println("Strings are lexicographically equal!");
        } else {
            System.out.println(secondString + " " + firstString);
        }
    }
}

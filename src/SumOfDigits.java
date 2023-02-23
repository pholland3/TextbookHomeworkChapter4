/**
 * @Class: SumOfDigits
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 23 February 2023
 *
 * Description - This program accepts number input from the user, and then uses a loop to add the digits of the sum together
 * and output that to the user.
 */

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program will accept a number, and tell you the sum of the digits in that number!");
        System.out.println("Please enter your number: ");
        int number = input.nextInt();
        int digit = 0;
        int sum = 0;

        while(number > 0) {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        System.out.println("The sum of the digits is: " + sum);

    }
}

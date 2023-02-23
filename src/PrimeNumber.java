/**
 * @Class: PrimeNumber
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 23 February 2023
 *
 * Description - This program accepts an integer from a user, uses a for loop to determine if the number is prime,
 * and then uses a while loop to determine when the boolean condition is satisfied.
 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Prime Number program!");
        System.out.println("This program accepts an integer input from the user, and then");
        System.out.println("determines if the number is prime.");
        System.out.println("Please enter an integer value: ");
        int userInput = input.nextInt();

        boolean isPrime = false;

        for(int i = 2;i <= userInput / 2;i ++) {
            if (userInput % i == 0) {
                isPrime = true;
                break;
            }
        }

        if (!isPrime) {
            System.out.println(userInput + " is a prime number.");
        } else {
            System.out.println(userInput + " is NOT a prime number.");
        }

        }
    }
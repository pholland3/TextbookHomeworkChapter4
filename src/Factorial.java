/**
 * @Class: Factorial
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 23 February 2023
 *
 * Description - This program accepts number input from the user, and then using a for loop, produces the factorial
 * of that number.
 */

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the factorial program!");
        System.out.println("Please enter a number, and the program will show you the factorial value of that number.");
        int number = input.nextInt();
        int factorial = 1;
        for(int i=1;i<=number;i++){
            factorial = factorial * i;
        }
        System.out.println("The factorial of the number " + number + " is " + factorial);
    }
}

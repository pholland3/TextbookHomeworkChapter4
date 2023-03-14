/**
 * @Class: FibonacciSequence
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 13 March 2023
 *
 * Description - This program displays the first 30 digits of the Fibonacci sequence.
 */

import java.util.Scanner;

public class FibonacciSequence {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            int a = 0;
            int b = 1;
            int c = 0;
            int i = 0;
            System.out.println("The first 30 terms of the Fibonacci sequence are: ");

            while (i < 30) {
                System.out.println(a + " ");
                c = a + b;
                a = b;
                b = c;
                i++;
            }
        }
    }

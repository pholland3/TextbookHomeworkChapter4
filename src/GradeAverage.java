/**
 * @Class: GradeAverage
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 23 February 2023
 *
 * Description - This program accepts user input of a grade and keeps a running count of the number of values entered, as well as
 * an average of the values entered. If the user enters anything except an integer, it will cease.
 */

import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        int totalGrade = 0;
        int average = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Grade Average Calculator!");
        System.out.println("This program accepts user input of an integer test grade, and calculates an average for the values");
        System.out.println("entered. The program terminates if the user does not enter an integer.");

        boolean isInteger = false;

        while(!isInteger) {
            count++;
            System.out.println("Please enter a grade: ");
            int grade = input.nextInt();
            System.out.println("You entered : " + grade);
            totalGrade = totalGrade + grade;
            average = totalGrade / count;
            System.out.println("Over " + count + " tests, the average grade is: " + average);
        }
    }
}

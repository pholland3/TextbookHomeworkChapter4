/**
 * @Class: HighestLowestGrades
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 13 March 2023
 *
 * Description - This program accepts user input of a grade and will report the highest and lowest grades in the series.
 * If the user enters anything except an integer, it will cease.
 */

import java.util.Scanner;

public class HighestLowestGrades {
    public static void main(String[] args) {
        int lowestGrade = 0;
        int highestGrade = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to High/Low Grade!");
        System.out.println("This program allows the user to input a series of grades, and will report the highest");
        System.out.println("and lowest grades. The program terminates if the user does not enter an integer.");

        boolean isInteger = false;

        while(!isInteger) {
            count++;
            System.out.println("Please enter a grade: ");
            int grade = input.nextInt();
            System.out.println("You entered : " + grade);
            if (grade > highestGrade) {
                highestGrade = grade;
            } else if (grade < lowestGrade || grade > 0) {
                lowestGrade = grade;
            }




            System.out.println("Over " + count + " tests");
            System.out.println("Highest grade: " + highestGrade);
            System.out.println("Lowest grade: " + lowestGrade);
        }
    }
}

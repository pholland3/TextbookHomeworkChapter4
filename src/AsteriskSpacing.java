/**
 * @Class: AsteriskSpacing
 * @Author: Peyton Holland
 * @Version 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 13 March 2023
 *
 * Description - This program displays spaced asterisks.
 */
public class AsteriskSpacing {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j >= 6 - i) {
                    System.out.print("*");
                    break;
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            {
            }
        }
    }
}

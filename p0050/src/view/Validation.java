/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.Scanner;

/**
 *
 * @author HP
 */

public class Validation {

    private static final Scanner sc = new Scanner(System.in);

    public static double checkInputDouble() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }

        }
    }

    public static boolean checkOdd(double n) {
        return n % 2 == 1;
    }

    public static boolean checkEven(double n) {
        return n % 2 == 0;
    }

    public static boolean checkSquareNumber(double n) {
        return (int) Math.sqrt(n) * (int) Math.sqrt(n) == n;
    }
}

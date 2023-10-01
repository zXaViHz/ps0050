/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import view.Validation;

/**
 *
 * @author HP
 */


public class Manager {
    
    public static void superlativeEquation() {
        System.out.print("Enter A: ");
        double a = Validation.checkInputDouble();
        System.out.print("Enter B: ");
        double b = Validation.checkInputDouble();
        double x = -b / a;
        System.out.println("Solution: x=" + x);
        displayOddEvenSquareInSuperLativeEquation(a, b, x);
        
    }
    
    public static void displayOddEvenSquareInSuperLativeEquation(double a, double b, double x){
        System.out.print("Number is odd: ");
        if (Validation.checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (Validation.checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (Validation.checkOdd(x)) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Number is even: ");
        if (Validation.checkEven(a)) {
            System.out.print(a + " ");
        }
        if (Validation.checkEven(b)) {
            System.out.print(b + " ");
        }
        if (Validation.checkEven(x)) {
            System.out.print(x + " ");
        }  
        System.out.println();
        System.out.print("Number is perfect square: ");
        if (Validation.checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (Validation.checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (Validation.checkSquareNumber(x)) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
    public static void quadraticEquation() {
        System.out.print("Enter A: ");
        double a = Validation.checkInputDouble();
        System.out.print("Enter B: ");
        double b = Validation.checkInputDouble();
        System.out.print("Enter C: ");
        double c = Validation.checkInputDouble();
        double delta = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        displayOddEvenSquareInQuadraticEquation(a, b, c, x1, x2);
    }
    
    public static void displayOddEvenSquareInQuadraticEquation(double a, double b, double c, double x1, double x2){
                System.out.print("Number is odd: ");
        if (Validation.checkOdd(a)) {
            System.out.print(a + " ");
        }
        if (Validation.checkOdd(b)) {
            System.out.print(b + " ");
        }
        if (Validation.checkOdd(c)) {
            System.out.print(c + " ");
        }
        if (Validation.checkOdd(x1)) {
            System.out.print(x1 + " ");
        }
        if (Validation.checkOdd(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
        System.out.print("Number is even: ");
        if (Validation.checkEven(a)) {
            System.out.print(a + " ");
        }
        if (Validation.checkEven(b)) {
            System.out.print(b + " ");
        }
        if (Validation.checkEven(c)) {
            System.out.print(b + " ");
        }
        if (Validation.checkEven(x1)) {
            System.out.print(x1 + " ");
        }
        if (Validation.checkEven(x2)) {
            System.out.print(x1 + " ");
        }
        System.out.println();
        System.out.print("Number is perfect square: ");
        if (Validation.checkSquareNumber(a)) {
            System.out.print(a + " ");
        }
        if (Validation.checkSquareNumber(b)) {
            System.out.print(b + " ");
        }
        if (Validation.checkSquareNumber(c)) {
            System.out.print(c + " ");
        }
        if (Validation.checkSquareNumber(x1)) {
            System.out.print(x1 + " ");
        }
        if (Validation.checkSquareNumber(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();

    }
    
    
}

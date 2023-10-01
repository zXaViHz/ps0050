/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package view;

import controller.EquationManagement;

public class Main {

    public static void main(String[] args) {
        String title = "=============== Equation program ================";
        String[] options = {"Calculate Superlative Equation", "Calculate Quadratic Equation", "Exit"};
        EquationManagement manager = new EquationManagement(title, options);
        manager.run();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Manager;
import view.Menu;
/**
 *
 * @author HP
 */
public class EquationManagement extends Menu{

    public EquationManagement() {
    }

    public EquationManagement(String title, String[] s) {
        super(title, s);
    }
    
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                Manager.superlativeEquation();
                break;
            case 2:
                Manager.quadraticEquation();
                break;
            case 3: 
                System.out.println("Exited");
                return;
            default:
                System.err.println("Choose 1-3");
        }
    } 

    public void run() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

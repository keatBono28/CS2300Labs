/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.lab05;

/**
 *
 * @author Keaton Bonomo
 * 
 * CS 2300
 * Lab 05
 * 2/13/2019
 * 
 * 
 */
public class Lab05Math {
    public static void main(String[] args) {
        System.out.println("Lab 05");
        int i = 0;
        //While Loop Testing
        while (i < 10){
            System.out.println("");
            System.out.println("");
            System.out.println("i: " + i);
            i++;  
        }
        // For Loop with Addition
        for (int j = 0; j < 12; j++) {
            System.out.println("" + j + " + " + j + " = " + (j + j));
        }
        // For Loop with Multiplication
        for (int j = 0; j < 12; j++) {
            System.out.println("" + j + " * " + j + " = " + (j*j));
        }
        // For Loop with Interger Division
        for (int j = -10; j < 11; j++) {
            System.out.println("" + j + " / 3" + " = " + (j/3));
        }
        
        
    }
 
}

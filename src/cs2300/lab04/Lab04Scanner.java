/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.lab04;

import java.util.Scanner;

/**
 *
 * @author kb619814
 */
public class Lab04Scanner {
    private static Scanner scanner = new Scanner(System.in);
    
    private static void taskInt(){
        System.out.println("Enter an integer: ");
        int input = scanner.nextInt();
        System.out.println("You entered " + input + ".");
    }
    private static void taskDouble(){
        System.out.println("Enter a double: ");
        double input = scanner.nextDouble();
        System.out.println("You entered " + input + ".");
    }
    
    private static void taskLine(){
        System.out.println("Enter a line of text: ");
        String input = scanner.nextLine();
        System.out.println("Your input text is " + input + ".");
    }
    private static void taskName(){
        System.out.println("Enter your name as a string with exactly one blank space");
        String input = scanner.nextLine();
        System.out.println("You entered " + input + ".");
        int indexOfBlank = input.indexOf(" ");
        System.out.println("The index of the blank is " + indexOfBlank);
    }
    
    private static void taskNameSeperator(){
        System.out.print("Enter your name with one space in between: ");
        String input = scanner.nextLine();
        int indexOfSpace = input.indexOf(" ");
        String message = "first name: " + input.substring(0,indexOfSpace) + ", last name: " + input.substring(indexOfSpace+1);
        System.out.println(message);
    }
    
    public static void main(String[] args) {
            System.out.println("Lab 04. Scanner Project");
            // Testing methods
            // taskInt();
            // taskDouble();
            // taskLine();
            // taskLine();
            // taskName();
            taskNameSeperator();
    }
}

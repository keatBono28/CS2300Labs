/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.project01;

/**
 *
 * @Author  Keaton Bonomo, Ohio Univ Student
 * @OHIO ID: kb619814
 * @Date:    2/16/2019
 * 
 */
public class P1BasicStuff {
    // Main Class
    public static void main(String[] args){
        System.out.println("Project 1");
        stringStuff();
        numberOutputStuff();
        System.out.println("");
        intMathTable();
        System.out.println("");
        System.out.println("Keaton Bonomo");
    }
    // String Stuff Class
    private static void stringStuff(){
        //Variables
        String lastName = new String("Bonomo");
        String firstName = "Keaton";
        String fullName = firstName + " " + lastName;
        //Output to the Console
        System.out.println("My name is: " + fullName);
        System.out.println("I said: " + fullName + "!");
        System.out.println("22: " + fullName + " " + 2 + 2);
        System.out.println("4: " + fullName + " " + (2+2));
        System.out.println();
    }
    // Number Stuff Class
    private static void numberOutputStuff(){
        // EXAMPLE ONE
        //Vairables
        double oneThird = 1.0 / 3.0;
        //Output to the Console
        System.out.printf("%f", oneThird);
        System.out.println("");
        System.out.printf("\n|%f|",oneThird);
        System.out.printf("\n|%20.2f|", oneThird);
        System.out.printf("\n|%20.12f|", oneThird);
        System.out.printf("\n|%20.20f|", oneThird);
        System.out.printf("\n|%-20.2f|", oneThird);
        System.out.printf("\n|%20.0f|", oneThird);
        System.out.println("");
        // EXAMPLE TWO
        int a = 2;
        int b = 3;
        double x = 0.66666;
        System.out.printf("\nMath: %d / %d = %f", a, b, x);
        System.out.println("");
    }
    // Helper Method - Helper Line
    private static void headerLine(){
        System.out.printf("%10s", "a");
        System.out.printf("%10s", "b");
        System.out.printf("%10s", "(a * b)");
        System.out.printf("%10s", "(a / b)");
        System.out.printf("%10s", "(a % b)");
        System.out.println("");
    }
    // Helper Method - Math Line
    private static void mathLine(int a, int b){
        System.out.printf("\n"); // new line
        System.out.printf("%10d", a); // write a
        System.out.printf("%10d", b); // write b
        System.out.printf("%10d", a * b); // write a * b
        System.out.printf("%10d", a / b); // write a / b
        System.out.printf("%10d", a % b); // write a % b
   
    }
    // Math Table
    private static void intMathTable(){
        System.out.println("--------------- Integer Math Table ---------------");
        headerLine();
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < 12; ++i){
            mathLine(i, 5);
        }
        System.out.println("");
    }
}

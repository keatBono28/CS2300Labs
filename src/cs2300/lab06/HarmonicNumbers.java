/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.lab06;

/**
 * @author Keaton Bonomo
 * CS 2300
 * Lab 06: Harmonic Numbers
 * February 18, 2019
 */
public class HarmonicNumbers {
    public static void main(String[] args) {
        System.out.println("Harmonic Numbers.");
        System.out.println("Keaton Bonomo");
        System.out.println("");
        System.out.println("");
        firstExample();
        System.out.println("");
        secondExample();
    }
    // Method to do the first example 
    private static void firstExample(){
        System.out.println("First Example");
        System.out.println("-------------");
        System.out.println("");
        System.out.printf("%4s","i");
        System.out.printf("%18s","harm(i)");
        System.out.println("");
        System.out.println("");
        double harm = 0.0;
        for (int i = 1; i <= 10; i++) {
            harm+=1.0/i;
            System.out.printf("%4d",1);
            System.out.printf("%18.12f",harm);
            System.out.println("");
        }
    }
    // Method to do the second example with logs
    private static void secondExample(){
        System.out.println("Second Example");
        System.out.println("-------------");
        System.out.println("");
        System.out.printf("%4s","i");
        System.out.printf("%18s","harm(i)");
        System.out.printf("%18s","harm(i) - ln(i)");
        System.out.println("");
        System.out.println("");
        double harm = 0.0;
        double diff = 0.0;
        for (int i = 1; i <= 10; i++) {
            harm+=1.0/i;
            diff=harm-Math.log(1.0*i);
            System.out.printf("%4d",1);
            System.out.printf("%18.12f",harm);
            System.out.printf("%18.12f",diff);
            System.out.println("");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.lab07;

/**
 * @author  Keaton Bonomo
 * Ohio ID: kb619814
 * Lab #7
 * 2/27/2019
 */
public class Lab07TwoInts {
    
    private static int a = 0;
    private static int b = 0;
    
    Lab07TwoInts(int a, int b){
        this.a = a;
        this.b = b;
        
    }
    
    // To String Method
    public String toString(){
        String strToReturn = "<" + a + ", " + b + ">";
        return strToReturn; 
    }
    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public boolean isAPos(){
        if(a > 0){
            return true;
        }else{
            return false;
        }
    }
    public boolean isBPos(){
        if(b > 0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        // First Example : Blue
        Lab07TwoInts blue = new Lab07TwoInts(4,11);
        System.out.println("blue = " + blue);
        // Second Example : Green
        Lab07TwoInts green = new Lab07TwoInts(14,-1);
        System.out.println("green = " + green);
        System.out.println("blue.b = " + blue.getB());
        // Logic for pos or neg
        if (green.isAPos()) {
            System.out.println("Yep!");
        }else{
            System.out.println("Nope!");
        }
        
        
    }
}

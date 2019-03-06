/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.lab08;

/**
 *
 * @author kybon
 */
public class Interval {
    private static double upper;
    private static double lower;

    public Interval(double lower, double upper){
        if(lower >= upper){
            double average = (lower + upper) / 2;
            System.out.println("Bad data overruled. (" + lower + ", " + upper + ") --> (" + average + ", " + average + ").");
            lower = upper = average;
        }        
        this.lower = lower;
        this.upper = upper;
    }
    public Interval(double argument){
        Interval oneArg = new Interval(argument, argument);
    }
    public Interval(){
        Interval defaultArg = new Interval(0,0);
    }
    public String toString(){
        String strToReturn = "[" + lower + ", " + upper + "]";
        return strToReturn;
    }
    public Interval plus(Interval rhs){
        return new Interval(this.lower + rhs.lower, this.upper + rhs.upper);
    }
    public double getMidpoint(){
        return (this.upper + this.lower) / 2;
    }
    public double getRadius(){
        return (this.upper - this.lower) / 2; 
    }
    
    
    public static void main(String[] args) {
        System.out.println("Interval class by Keaton Bonomo");
        System.out.println("CS 2300 Wednesday 2:00PM");
        Interval banana = new Interval(4, 14);
        System.out.println("banana = " + banana);
        Interval apple = new Interval(4, -2);
        System.out.println("apple = " + apple);
        Interval crisp = new Interval(4);
        System.out.println("crisp = " + crisp);
        Interval zero = new Interval();
        System.out.println("zero = " + zero);
        Interval unit = new Interval(0,1);
        System.out.println("unit = " + unit);
        Interval i_4_15 = banana.plus(unit);
        System.out.println("i_4_15 = " + i_4_15);
        double bananaMP = banana.getMidpoint();
        System.out.println("bananaMP = " + bananaMP); 
        double bananaR = banana.getRadius();
        System.out.println("bananaR = " + bananaR);
    }
}

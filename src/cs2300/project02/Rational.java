/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.project02;

/**
 *
 * @author kybon
 */
public class Rational {
    // Utility Method
    private static int greatestCommonDivisor(int a, int b){
        int c;
        while (b!=0){
            c  = a % b;
            a = b;
            b = c;
        }
        return Math.abs(a);
    }
    
    // Testing GCD
    private static void testGcd(){
        System.out.println("");
        System.out.println("Test Greatest Common Denominotr");
        System.out.println("");
        for (int i = -21; i < 31; i+=2) {
            for (int j = -17; j < 31; j+=3) {
                System.out.printf("\n(%5d,%5d) --> %5d", i, j, greatestCommonDivisor(i,j));
            }
        }
    }
    
    // the numer and denom fields represent a fraction
    // CLASS INVARIANTS:
    // CI1: denom is not 0
    // CI2: denom is positive
    // CI3: numer and denom are in lowest terms
    
    private static int numer;
    private static int denom;
    
    public Rational(int numer, int denom){
        // CI1. No way to fix, must throw exception.
        if (denom == 0) {
            throw new ZeroDenomException();
        }
        // CI2: Can fix. 
        if (denom < 0){
            numer *= -1;
            denom *= -1;
        }
        // CI3: Can fix.
        int gcd = greatestCommonDivisor(numer, denom);
        if (gcd != 1) {
            numer /= gcd;
            denom /= gcd;
        }
        // all class invariants now stisfied, initialize fields:
        this.numer = numer;
        this.denom = denom;
    }
    
    public Rational(int integer){
        this(integer, 1);
    }
    public String toString(){
        return numer + " / " + denom;
    }
    public double toDouble(){
        return 1.0 * numer/denom;
    }
    private static void testClass(){
        System.out.println("Rational tests");
        System.out.println("");
        System.out.println("Test C-tor");
        System.out.println("Expected outcome: 4/25, -4/25, -4/25, 4/25, 17/1, 0/1.");
        System.out.println("");
        Rational rat01 = new Rational(144, 900);
        Rational rat02 = new Rational(-144, 900);
        Rational rat03 = new Rational(144, -900);
        Rational rat04 = new Rational(-144, -900);
        Rational rat05 = new Rational(17);
        System.out.println("rat01 = " + rat01);
        System.out.println("rat02 = " + rat02);
        System.out.println("rat03 = " + rat03);
        System.out.println("rat04 = " + rat04);
        System.out.println("rat05 = " + rat05);
        
        System.out.println("");
        System.out.println("Try bad input");
        try {
            Rational rat00 = new Rational(0,0);
        } catch(ZeroDenomException zde){
            System.out.println("Expected Zero Denominator Exception. " + zde);
        } catch(Exception e){
            System.out.println("This should never happen.");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Test toDouble. Expect 0.16");
        System.out.println("rat04 to double: " + rat04.toDouble());
    }
    
    
    public static void main(String[] args) {
        System.out.println("Rational Class");
        System.out.println("Impleneted by Keaton Bonomo");
        System.out.println("");
        // testGcd();
        testClass();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.lab03;

/**
 *
 * @author kb619814
 */
public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        for(int i = 0; i < 20; ++i){
            if (i % 2 == 0){
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }
        int total = 100;
        for (int i = 0; i < 20; ++i){
            total += i;
        }
        System.out.println("total is " + total);
    }
}

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
public class ZeroDenomException extends RuntimeException {

    /**
     * Creates a new instance of <code>ZeroDenomException</code> without detail
     * message.
     */
    public ZeroDenomException() {
    }

    /**
     * Constructs an instance of <code>ZeroDenomException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ZeroDenomException(String msg) {
        super(msg);
    }
}
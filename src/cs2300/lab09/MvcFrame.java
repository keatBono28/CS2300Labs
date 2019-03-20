/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.lab09;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author kybon
 */
public final class MvcFrame extends JFrame{
    private final Model model;

    public MvcFrame(Model model) throws HeadlessException {
        this.model = model;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000,700);
        setTitle("MVC Lab 09");
        setVisible(true);
        System.out.println("MVCFrame C-Tor");
    }
}

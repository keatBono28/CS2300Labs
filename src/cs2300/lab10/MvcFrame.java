/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.lab10;

import java.awt.BorderLayout;
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
        setTitle("MVC Lab 10");
        setLayout(new BorderLayout());
        add(model.getTitle(),BorderLayout.NORTH);
        add(model.getController(), BorderLayout.WEST);
        add(model.getView(),BorderLayout.CENTER);
        
        setVisible(true);
        System.out.println("MVCFrame C-Tor");
    }
}

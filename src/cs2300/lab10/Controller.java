/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.lab10;

import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JPanel;


/**
 *
 * @author kybon
 */
public final class Controller extends JPanel {
    private final Model model;

    public Controller(Model model) {
        this.model = model;
        setBorder(BorderFactory.createLineBorder(Color.GREEN, 2));
        System.out.println("Controller C-Tor");
    }

}


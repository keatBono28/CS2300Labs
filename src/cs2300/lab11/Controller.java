/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.lab11;


import java.awt.Color;
import java.awt.GridLayout;
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
        setLayout(new GridLayout(6,1));
        add(new ProgrammerPanel(model));
        add(new SizeXPanel(model));
        add(new SizeYPanel(model));
        add(new ColorPanel(model));
        add(new SolidPanel(model));
        add(new ViewPanel(model));
        System.out.println("Controller C-Tor");
    }

}


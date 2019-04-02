/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.lab11;

import javax.swing.JLabel;

/**
 *
 * @author kybon
 */
public final class ProgrammerPanel extends ControlPanel{
    private final JLabel jlProgrammer = new JLabel("Programmer: ");
    private final JLabel jlKeaton = new JLabel("Keaton Bonomo");
    
    public ProgrammerPanel(Model model) {
        super(model);
        add(jlProgrammer);
        add(jlKeaton);
    }
    
}

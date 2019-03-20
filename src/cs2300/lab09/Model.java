/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.lab09;

import javax.swing.SwingUtilities;

/**
 *
 * @author kybon
 */
public class Model {
    private final Title title = new Title();
    private final Controller controller;
    private final View view;
    private final MvcFrame mvcFrame;

    public Model() {
        controller = new Controller(this);
        view = new View(this);
        mvcFrame = new MvcFrame(this);
        System.out.println("Model C-Tor");
    }
    
    public static void main(String[] args) {
        System.out.println("Start MVC GUI Application");
        SwingUtilities.invokeLater(() -> {
            Model model = new Model();
        });
    }
}

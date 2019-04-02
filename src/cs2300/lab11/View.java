/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs2300.lab11;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.LayoutManager;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author kybon
 */
public class View extends JPanel {
    private final Model model;

    public View(Model model) {
        this.model = model;
        setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
        System.out.println("View C-Tor");
        repaint();
    }
    
    public void paintComponent(Graphics g){
        
        super.paintComponents(g);
        // center of view panel, in pixels:
        int xCenter = getWidth() / 2;
        int yCenter = getHeight() / 2;
        // upper left corner of object we will draw:
        int xStart = xCenter - model.getxSize();
        int yStart = yCenter - model.getySize();
        // width of object we will draw:
        int width = 2 * model.getxSize();
        int height = 2 * model.getySize();
        // update drawing color
        g.setColor(model.getColor());
        // clear out the old picture
        g.clearRect(0,0,getWidth(),getHeight());
        // draw new picture
        if (model.isSolid()) {
            g.fillOval(xStart, yStart, width, height);
        } else {
            g.drawOval(xStart, yStart, width, height);
        }
    }
}
